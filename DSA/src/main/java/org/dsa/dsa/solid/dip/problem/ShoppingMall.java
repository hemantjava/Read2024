package org.dsa.dsa.solid.dip.problem;

public class ShoppingMall {

    private DebitCard bankCard;

    public ShoppingMall(DebitCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
       DebitCard debitCard=new DebitCard();
       // CreditCard creditCard=new CreditCard();

        //CreditCard bankCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
