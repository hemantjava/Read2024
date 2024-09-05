package org.dsa.interview.mulithreading.synchronization;

public class ATMTransaction extends Thread{

    final Account account;
    final double aDouble;
    public ATMTransaction(String name,Account account,double aDouble){
        super(name);
        this.account = account;
        this.aDouble = aDouble;
    }

    @Override
    public void run() {
       account.withDraw(aDouble);
    }
}
