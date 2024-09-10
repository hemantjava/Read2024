package org.dsa.design.patterns.solid.isp;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot working");
    }
}
