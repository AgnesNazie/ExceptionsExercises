package com.agnes.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Bankaccount bankaccount = new Bankaccount(101, "Agnes");

        try {
            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            bankaccount.deposit(depositAmount);
            System.out.println("Deposited successful. New balance: " + bankaccount.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit error: " + e.getMessage());
        }
        try {
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            bankaccount.withdrawal(withdrawAmount);
            System.out.println("Withdrawal successful. New balance: " + bankaccount.getBalance());
        } catch (InsufficientBalanceExceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }
        System.out.println("balance" + bankaccount.getBalance());
        bankaccount.toString();
    }
}