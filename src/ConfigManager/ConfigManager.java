package ConfigManager;

/**
 * This class is made for loading the File
 * and parse it to XML parser and collect the object from that one
 */

import Parser.TextReaderAdapter;
import Parser.XMLParser;
import factory.AbstractFactory;
import GUI.UIElement;
import javafx.scene.control.Control;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

// Singleton class


public class ConfigManager {
    private AbstractFactory factory;
    private static ConfigManager configManager;
    private int itr = 0;
    private final ArrayList<UIElement> uiElements = new ArrayList<>();
    private String fileName;

    private ConfigManager() {

    }

    public static ConfigManager getInstance() {
        if (configManager == null) {
            configManager = new ConfigManager();
        }
        return configManager;
    }

    public void execute() {
        File configFile = new File(fileName);
        TextReaderAdapter xmlReader;

        if (fileName.contains(".xml"))
            xmlReaderLoadConfig(configFile);

        else
        {
            xmlReader = new TextReaderAdapter(configFile);
            xmlReader.loadConfig();
        }


    }

    public void addElementBuilder(UIElement uiElement) {
        this.uiElements.add(uiElement);
    }

    public boolean hasMoreItems() {
        return itr != uiElements.size();
    }

    public Control nextElement() {
        if (itr == uiElements.size())
            return null;
        else {
            return uiElements.get(itr++).getElement();
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public AbstractFactory getFactory() {
        return factory;
    }
    public void xmlReaderLoadConfig(File file) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLParser xmlParser = new XMLParser();
            saxParser.parse(file, xmlParser);
        } catch (SAXException | IOException | ParserConfigurationException exception) {
            exception.printStackTrace();
        }
    }

}

