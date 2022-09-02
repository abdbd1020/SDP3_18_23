package Parser;

import ConfigManager.ConfigManager;
import GUI.UIElement;
import factory.AbstractFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Locale;

public class XMLParser extends DefaultHandler {
    final static String BUTTON = "button";
    final static String TEXT = "text";
    final static String EDIT_TEXT = "edittext";
    final static String VALUE = "value";
    final static String COLOR = "color";
    final static String FONT = "font";
    final static String CONFIG = "config";      
    final AbstractFactory abstractFactory = ConfigManager.getInstance().getFactory();
    UIElement guiElement;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        // Create ElementBuilder
        switch (qName.toLowerCase(Locale.ROOT)) {
            case BUTTON -> guiElement = abstractFactory.createButton();
            case TEXT -> guiElement = abstractFactory.createTextField();
            case EDIT_TEXT -> guiElement = abstractFactory.createEditText();
        }

        // Here we read the attributes of the XML file and set the value to GUI Element
        if(attributes.getValue(VALUE)!=null){
            String value = attributes.getValue(VALUE);
            guiElement.setValue(value);
        }
        if(attributes.getValue("X")!=null){
            int x = Integer.parseInt(attributes.getValue("X"));
            guiElement.setXCoordinate(x);
        }
        if(attributes.getValue("Y")!=null){
            double y = Double.parseDouble(attributes.getValue("Y"));
            guiElement.setYCoordinate(Integer.parseInt(attributes.getValue("Y")));
        }
        if(attributes.getValue(COLOR)!=null){
            String color = attributes.getValue(COLOR);
            guiElement.setColor(color);
        }
        if(attributes.getValue(FONT)!=null){
            String font = attributes.getValue(FONT);
            guiElement.setFont(font);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(!qName.equals(CONFIG)) {
            ConfigManager configManager = ConfigManager.getInstance();
            configManager.addElementBuilder(guiElement);
        }
    }
}
