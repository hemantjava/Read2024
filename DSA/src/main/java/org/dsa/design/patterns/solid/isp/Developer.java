package org.dsa.design.patterns.solid.isp;

public class Developer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Developer working");
    }

    @Override
    public void eat() {
        System.out.println("Developer eating");
    }
}


