package org.dsa.design.patterns.solid.dip;

public class MackBook {
    private final Mouse mouse;
    private final KeyBoard keyBoard;

    public MackBook(Mouse mouse, KeyBoard keyBoard) {
        this.mouse = mouse;
        this.keyBoard = keyBoard;
    }
    public void print(){
        mouse.click();
        keyBoard.type();
    }
}
