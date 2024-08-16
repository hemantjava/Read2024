package org.dsa.design.patterns.structural.adaptor.example2.adaptee;

public class XMLDataFormatImpl implements XMLDataFormat {

    @Override
    public String xmlData() {
        return "XML";
    }
}
