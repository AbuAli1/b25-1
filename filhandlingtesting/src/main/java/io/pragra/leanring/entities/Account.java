package io.pragra.leanring.entities;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private User user;
    private double balance;
    private List<Transaction> transactions;
    private double fee;
    private int noOfTrx;
    private double minBalnce;

    public Account(User user, double minBalnce, double balance, int noOfTrx) {
        this.user = user;
        this.minBalnce = minBalnce;
        this.balance = balance;
        this.noOfTrx = noOfTrx;
        transactions= new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getFee() {
        return fee;
    }

    public int getNoOfTrx() {
        return noOfTrx;
    }

    public double getMinBalnce() {
        return minBalnce;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
