package org.dsa.design.patterns.solid.dip;

public class WireLessdMouse implements  Mouse{
    @Override
    public void click() {
        System.out.println("wireless mouse");
    }
}