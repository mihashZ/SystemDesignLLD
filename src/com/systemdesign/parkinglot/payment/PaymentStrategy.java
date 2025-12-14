package com.systemdesign.parkinglot.payment;

public interface PaymentStrategy {
    public void processPayment(double amount);
}