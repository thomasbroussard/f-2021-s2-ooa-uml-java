package fr.epita.bankaccount.datamodel;


public abstract class Account {

    protected Double balance;

    public Account(double initialBalance){
        this.balance = initialBalance;
    }

}
