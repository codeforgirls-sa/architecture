package main.layered.domain.transfer;

import main.layered.domain.account.BankAccount;

import java.util.Date;

public class TransferTransaction {

    private BankAccount fromAccount;

    private BankAccount toAccount;

    private Integer amount;

    private Date creationDate;

    public TransferTransaction(BankAccount fromAccount, BankAccount toAccount, Integer amount, Date creationDate) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.creationDate = creationDate;
    }
}
