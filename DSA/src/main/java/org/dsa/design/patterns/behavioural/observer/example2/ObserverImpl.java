package org.dsa.design.patterns.behavioural.observer.example2;

public class ObserverImpl implements Observer {

    private final String name;


    public ObserverImpl(String name) {
        this.name = name;

    }

    @Override
    public void update(int num) {
        String string = name.toLowerCase();
        String val = "";
        switch (string) { //Enhanced switch statement without break jdk 17
            case "octa" -> val += Integer.toOctalString(num);
            case "hexa" -> val += Integer.toHexString(num);
            case "binary" -> val += Integer.toBinaryString(num);
            default -> System.out.println("invalid observer");
        }
        System.out.println(name + ":" + val);
    }
}
