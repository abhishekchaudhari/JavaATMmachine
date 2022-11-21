package main.company.service.impl;

import main.company.data.Cards;
import main.company.service.ATMoperations;
import main.company.service.ATMvalidations;

import java.util.Scanner;

public class ATMvalidationsImpl implements ATMvalidations {
    public boolean cardValidation() throws Exception {
        Scanner sc = new Scanner(System.in);
        Cards cards = new Cards();
        System.out.println("#####################################################################");
        System.out.println("Welcome to ATM machine!!");
        System.out.println("Enter Atm Number: ");
        int atmNumber = sc.nextInt();
        System.out.println("Enter CVV Number: ");
        int atmCVV = sc.nextInt();
        if(cards.getCard().containsKey(atmNumber) && cards.getCard().get(atmNumber).get(0).equals(atmCVV) ){
            System.out.println("Enter Pin: ");
            int atmPin = sc.nextInt();
            if(cards.getCard().get(atmNumber).get(1).equals(atmPin)){
                return true;
            }else {
                return false;
            }
        }else {
            throw new Exception("Please Insert Card Properly");
        }
    }

    public void coreOperations() throws Exception {
        ATMoperations op = new ATMoperationsImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------------------------------\n");
            System.out.println("1. View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
            System.out.println("Enter Choice: ");
            int ch = sc.nextInt();
            if (ch == 1) {
                op.viewBalance();
            } else if (ch == 2) {
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                op.withdrawAmount(withdrawAmount);
            } else if (ch == 3) {
                System.out.println("Enter Amount to Deposit: ");
                double depositAmount = sc.nextDouble();
                op.depositAmount(depositAmount);
            } else if (ch == 4) {
                op.viewMiniStatement();
            } else if (ch == 5) {
                System.out.println("Collect your ATM card\nThank yout for using ATM machine");
                System.exit(0);
            } else {
                System.out.println("Please enter correct choice");
            }
        }
    }
}
