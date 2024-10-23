package org.dsa.dsa.recursion;

public class PrintNNumber {
    private static void print(int num){
        if (num == 0){
            return;
        }
        System.out.print(num + " ");
        print(num -1);
    }
    public static void main(String[] args) {
        print(10);
    }
}
