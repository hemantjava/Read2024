package org.dsa.design.patterns.structural.adaptor.example2.adapter;

import org.dsa.design.patterns.structural.adaptor.example2.adaptee.XMLDataFormat;

public class JSONDataFormatAdapter implements JSONDataFormat {

    private final XMLDataFormat xmlDataFormat;

    public JSONDataFormatAdapter(XMLDataFormat xmlDataFormat) {
        this.xmlDataFormat = xmlDataFormat;
    }

    @Override
    public String jsonData() {
        return xmlDataFormat.xmlData().equalsIgnoreCase("xml") ? "JSON" : "Invalid type";
    }
}
