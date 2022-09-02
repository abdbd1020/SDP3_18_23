/**
 * This class converts the text file to XML file
 */
package Parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;
import java.util.ArrayList;

public class TextReaderAdapter {
    File file;
    public TextReaderAdapter(File file) {
        this.file = file;
    }


    public void loadConfig() {

        try {
            ArrayList<String> lines = readText();
            String fileName = "text_to_XML_converted"; // this is the new file that will be created
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("<config>\n");
            /*
            This algorithm converts the lines of the text file to XML
             */
            for(String line : lines) {
                line = "<" + line + "\" />";
                line = line.replaceAll(",", "\"");
                line = line.replaceFirst("\"", "");
                line = line.replaceAll(": ", "=\"");
                writer.write(line + "\n");
            }
            writer.write("</config>");
            writer.close();

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLParser xmlParser = new XMLParser();
            File file = new File(fileName);
            saxParser.parse(file, xmlParser);

        } catch (NullPointerException | IOException | ParserConfigurationException | SAXException exception){
            exception.printStackTrace();
        }

    }
    private ArrayList<String> readText() throws NullPointerException {
        ArrayList<String> lines = new ArrayList<>();
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));

            while( (str = br.readLine()) !=null){
                lines.add(str);
            }

            return lines;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
