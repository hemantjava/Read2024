package org.dsa.design.patterns.structural.adaptor.example2;

import org.dsa.design.patterns.structural.adaptor.example2.adaptee.XMLDataFormat;
import org.dsa.design.patterns.structural.adaptor.example2.adaptee.XMLDataFormatImpl;
import org.dsa.design.patterns.structural.adaptor.example2.adapter.JSONDataFormat;
import org.dsa.design.patterns.structural.adaptor.example2.adapter.JSONDataFormatAdapter;

public class Main {
    public static void main(String[] args) {
        XMLDataFormat xmlDataFormat = new XMLDataFormatImpl();
        JSONDataFormat jsonDataFormat = new JSONDataFormatAdapter(xmlDataFormat);
        System.out.println(jsonDataFormat.jsonData());
    }
}
