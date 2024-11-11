package org.dsa.interview.mulithreading.synchronization;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Setter
@Getter
public class Account {

    private double amount;

    public synchronized void deposit(double amountToBeAdded) {
        amount += amountToBeAdded;
    }

    public synchronized void withDraw(double amountToBeWithdraw) {
        Optional.of(amount).map(aDouble -> {
            if (aDouble >= amountToBeWithdraw) {
                return aDouble - amountToBeWithdraw;
            }else {
               throw  new RuntimeException("Amount not enough");
            }
        });
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                '}';
    }
}
