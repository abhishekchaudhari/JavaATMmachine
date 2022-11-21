package main.company.model;

public class ATM {
    public ATM() {
    }

    private double balance =10000;
    private double depositAmt;
    private double withdrawAmt;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmt() {
        return depositAmt;
    }

    public void setDepositAmt(double depositAmt) {
        this.depositAmt = depositAmt;
    }

    public double getWithdrawAmt() {
        return withdrawAmt;
    }

    public void setWithdrawAmt(double withdrawAmt) {
        this.withdrawAmt = withdrawAmt;
    }
}
