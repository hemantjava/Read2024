package org.dsa.interview.mulithreading.synchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Account hemant = new Account();
        hemant.setAmount(10000);
        GpayTransaction gpayTransaction = new GpayTransaction("gpay", hemant,5000);
        ATMTransaction atmTransaction = new ATMTransaction("ATM", hemant,5000);
        gpayTransaction.start();
        gpayTransaction.join();
        atmTransaction.start();
        System.out.println(hemant);
    }
}
