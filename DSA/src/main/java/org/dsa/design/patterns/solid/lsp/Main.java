package org.dsa.design.patterns.solid.lsp;

public class Main {
    public static void main(String[] args) {
        Bird fyingBird = new FlyingBird();
        Bird nonFlyingBird = new Ostrich();
        fyingBird.move();
        nonFlyingBird.move();
    }
}
