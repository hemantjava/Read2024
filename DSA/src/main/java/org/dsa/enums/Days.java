package org.dsa.enums;

import java.util.EnumMap;

public enum Days {
    ONE,TWO,THREE,FOUR;
   private static final EnumMap<Days,Integer> DAYS = new EnumMap<>(Days.class);

    static {
        DAYS.put(ONE,1);
        DAYS.put(TWO,2);
        DAYS.put(THREE,3);
        DAYS.put(FOUR,4);
    }

    public static Integer getDAYS(Days days) {
        return DAYS.get(days);
    }

    public static void main(String[] args) {
        System.out.println(getDAYS(Days.FOUR));
    }
}
