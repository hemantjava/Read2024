package org.dsa.design.patterns.solid.dip;

public class Main {
    public static void main(String[] args) {
        KeyBoard  keyBoard = new WiredKeyboard();
        Mouse mouse = new WiredMouse();
        MackBook mackBook = new MackBook(mouse,keyBoard);
        mackBook.print();
    }
}
