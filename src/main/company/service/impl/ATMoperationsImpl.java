package main.company.service.impl;

import main.company.model.ATM;
import main.company.service.ATMoperations;

import java.util.HashMap;
import java.util.Map;

public class ATMoperationsImpl implements ATMoperations {
    ATM atm = new ATM();
    Map<Double,String> miniStatement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
     }

    @Override
    public void depositAmount(double depositAmount) {
        if(depositAmount%100 ==0){
            System.out.println(depositAmount + "Deposited Successfully !!");
            miniStatement.put(depositAmount, "Amount Deposited!!");
            atm.setBalance(atm.getBalance() + depositAmount);
            viewBalance();
        } else {
            System.out.println("Please enter the amount in multiple of 100rs");
        }
    }

    @Override
    public void withdrawAmount(double withdrawAmount) throws Exception {
        if(atm.getBalance() < withdrawAmount){
            throw new Exception("Insufficient Balance!!");
        }
        if(withdrawAmount%100 == 0){
            System.out.println("Collect your cash" + withdrawAmount);
            miniStatement.put(withdrawAmount, "Amount Withdrawn!!");
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        } else {
            System.out.println("Please enter the amount in multiple of 100rs");
        }
    }

    @Override
    public void viewMiniStatement() {
        System.out.println("\n------------------------------------");
        miniStatement.forEach((k,v) -> System.out.println( k + " "+ v + "\n------------------------------------"));
    }
}
