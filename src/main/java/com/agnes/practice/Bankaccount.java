package com.agnes.practice;

public class Bankaccount {

    private int accountNumber;
    private String accountName;
    private double amount;
    private double balance;

    public Bankaccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        setAccountName(accountName);


    }
    //getter for accountnumber

    public int getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    //getter for accountname

    public String getAccountName() {
        return accountName;
    }


    public void setAccountName(String accountName) {
        if (accountName == null || accountName.trim().isEmpty())
            throw new IllegalArgumentException("account name can not be null or empty");
        this.accountName = accountName;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }


    public double withdrawal(double amount) throws InsufficientBalanceExceptions {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be greater than 0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be greater than 0");
        }
        balance += amount;
        return balance;

    }

    @Override
    public String toString() {
        return "Bankaccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }
}
