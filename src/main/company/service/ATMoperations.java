package main.company.service;

public interface ATMoperations {
    public void viewBalance();
    public void depositAmount(double depositAmount);
    public void withdrawAmount(double withdrawAmount) throws Exception;
    public void viewMiniStatement();
}
