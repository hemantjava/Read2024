package org.dsa.design.patterns.structural.facade;

public class HotelKeeperImpl implements HotelKeeper {
    @Override
    public Menus getVegMenu() {
        return new Menus("sambar", 10.2);
    }

    @Override
    public Menus getNonVegMenu() {
        return new Menus("chicken", 10.2);
    }

    @Override
    public Menus getVegNonMenu() {
        return new Menus("chicken/sambar", 10.2);
    }
}
