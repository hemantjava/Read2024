package org.dsa.design.patterns.structural.facade;

public interface HotelKeeper {


    public Menus getVegMenu();
    public Menus getNonVegMenu();
    public Menus getVegNonMenu();

}