package com.systemdesign.parkinglot.payment;

public class PaymentProcessor {
    private double amount;
    private PaymentStrategy paymentStrategy; // ParkingLot.PaymentStrategyPattern.Payment strategy interface
    // Constructor to initialize the payment amount and payment strategy
    public PaymentProcessor(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }
    // Process the payment using the assigned strategy
    public void processPayment() {
        if (amount > 0) {
            paymentStrategy.processPayment(amount);  // Delegating to strategy
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}