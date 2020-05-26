package main.layered.presentations;

import java.util.Date;

public class WithdrawPresentation {

    private String accountNumber;

    private Integer withdrawAmount;

    private String currentBalance;

    private Date transactionDate;

    private String atmNumber;


    public WithdrawPresentation() {
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setWithdrawAmount(Integer withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAtmNumber(String atmNumber) {
        this.atmNumber = atmNumber;
    }

    @Override
    public String toString() {
        return "WithdrawPresentation{" +
                "\n accountNumber='" + accountNumber + '\'' +
                "\n withdrawAmount=" + withdrawAmount +
                "\n currentBalance='" + currentBalance + '\'' +
                "\n transactionDate=" + transactionDate +
                "\n atmNumber='" + atmNumber + '\'' +
                "\n}";
    }
}
