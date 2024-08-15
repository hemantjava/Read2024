package org.dsa.design.patterns.solid.dip;

public class WiredMouse implements  Mouse{
    @Override
    public void click() {
        System.out.println("wired mouse");
    }
}
