package org.dsa.dsa.solid.dip.solution;

public class DebitCard implements BankCard {

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}
