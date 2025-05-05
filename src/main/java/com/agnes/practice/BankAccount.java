package com.agnes.practice;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double amount;
    private double balance;
    private double deposit;
    private double withdraw;
    // constructor

    public BankAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        setAccountName(accountName);
        this.balance = balance;
    }
    //getter for accountName

    public String getAccountName() {
        return accountName;
    }
    //setter for accountname

    public void setAccountName(String accountName) {
        if (accountName == null || accountName.trim().isEmpty())
            throw new IllegalArgumentException("Account Name cannot be null or empty");
        this.accountName = accountName;
    }
    //getter for account Number

    public int getAccountNumber() {
        return accountNumber;
    }
    //getter for deposit
    public double getDeposit() {
        return deposit;
    }
    //setter for deposit
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    //method to deposit

    public double getWithdraw(double amount) {
        if( amount < balance)
            throw new InsufficientFundException("insufficient fund" + "This is your current balance " + balance);
         balance -= balance;
        return withdraw;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
