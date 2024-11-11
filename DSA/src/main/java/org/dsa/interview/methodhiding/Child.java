package org.dsa.interview.methodhiding;

public class Child extends Parent {
    public static void show(){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.show();

        Child child = new Child();
        child.show();
    }
}
