package Parser;

import ConfigManager.ConfigManager;
import GUI.UIElement;
import factory.AbstractFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Locale;

public class XMLParser extends DefaultHandler {
    final static String BUTTON = "button";
    final static String TEXTFIELD = "text";
    final static String EDIT_TEXT = "edittext";
    final static String VALUE = "value";
    final static String COLOR = "color";
    final static String FONT = "font";
    final static String HEIGHT = "height";
    final static String WIDTH = "width";
    final static String CONFIG = "config";
    final AbstractFactory abstractFactory = ConfigManager.getInstance().getFactory();
    UIElement uiElement;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {



        String type = qName.toLowerCase(Locale.ROOT);

        switch (qName.toLowerCase(Locale.ROOT)) {
            case BUTTON -> uiElement = abstractFactory.createButton();
            case TEXTFIELD -> uiElement = abstractFactory.createTextField();
            case EDIT_TEXT -> uiElement = abstractFactory.createEditText();
        }


        if(attributes.getValue(VALUE)!=null){
            String value = attributes.getValue(VALUE);
            uiElement.setValue(value);
        }
        if(attributes.getValue("X")!=null){
            int x = Integer.parseInt(attributes.getValue("X"));
            uiElement.setXCoordinate(x);
        }
        if(attributes.getValue("Y")!=null){
            double y = Double.parseDouble(attributes.getValue("Y"));
            uiElement.setYCoordinate(Integer.parseInt(attributes.getValue("Y")));
        }
        if(attributes.getValue(COLOR)!=null){
            String color = attributes.getValue(COLOR);
            uiElement.setColor(color);
        }
        if(attributes.getValue(FONT)!=null){
            String font = attributes.getValue(FONT);
            uiElement.setFont(font);
        }
        if(attributes.getValue(HEIGHT)!=null){
            Double size =  Double.parseDouble(attributes.getValue(HEIGHT));
            uiElement.setHeight(size);
        }
        if(attributes.getValue(WIDTH)!=null){
            Double size =  Double.parseDouble(attributes.getValue(WIDTH));
            uiElement.setWidth(size);

        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if(!qName.equals(CONFIG)) {
            ConfigManager configManager = ConfigManager.getInstance();
            configManager.addElementBuilder(uiElement);
        }
    }
}
