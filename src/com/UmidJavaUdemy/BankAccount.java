package com.UmidJavaUdemy;
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {
    private String customerName, email, phoneNumber;
    private double accNumber, balance;

    public BankAccount(){
        this("Some name", "Dummy email", "911", 2.0, 100.0);
        System.out.println("Empty constructor");
    }
    public BankAccount (String customerName, String email, String phoneNumber, double accNumber, double balance){
        System.out.println("Parameterized constructor called");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(customerName, email, phoneNumber, 999.0, 100.0);
    }

    public double addBalance(double addedAmount){
        return this.balance += addedAmount;
    }
    public void deductBalance(double deductAmount){
        if(this.balance >= deductAmount){
            this.balance -= deductAmount;
            System.out.println("New balance " + balance);
        }
        else
            System.out.println("Insufficient funds");
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccNumber(double accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }
}
