package org.dsa.interview.mulithreading.synchronization;

import java.util.Optional;

public class Account {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public synchronized void deposit(double amountToBeAdded) {
        amount += amountToBeAdded;
    }

    public synchronized void withDraw(double amountToBeWithdraw) {
        Optional.ofNullable(amount).map(aDouble -> {
            if (aDouble >= amountToBeWithdraw) {
                return aDouble - amountToBeWithdraw;
            }
            return aDouble;
        }).orElseThrow(() -> new RuntimeException("Insufficient amount"));
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                '}';
    }
}
