package org.dsa.interview.java17;

public class SwitchExample {
    public static void main(String[] args) {
        System.out.println(getDatType("Monday"));
        System.out.println(getDatType("Sunday"));
        System.out.println(getDatType("kgs"));
    }

    public static String getDatType(String  day){
        return switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "WeekDay";
            case "Saturday", "Sunday" -> "WeekEnd";
            default -> "Invalid Day";
        };
    }
}