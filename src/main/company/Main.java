package main.company;
import main.company.data.Cards;
import main.company.service.ATMoperations;
import main.company.service.ATMvalidations;
import main.company.service.impl.ATMoperationsImpl;
import main.company.service.impl.ATMvalidationsImpl;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ATMvalidations atmValidations = new ATMvalidationsImpl();
        try{
            boolean isValid = atmValidations.cardValidation();
            if (isValid) {
                atmValidations.coreOperations();
            } else {
                throw new Exception("Incorrect ATM number or PIN");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            main(new String[5]);
        }
    }

}
