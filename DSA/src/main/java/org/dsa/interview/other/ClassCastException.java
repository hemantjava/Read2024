package org.dsa.interview.other;

class Parent {

}

class Child1 extends Parent {

}

class Child2 extends Parent {

}

public class ClassCastException {
    public static void main(String[] args) {

        Parent p = new Parent();
        Parent p1 = new Child1();
        Parent p2 = new Child2();
        System.out.println();

    }
}
