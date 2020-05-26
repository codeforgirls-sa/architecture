package main.layered.domain.withdraw;

import main.layered.domain.account.BankAccount;

import java.util.Date;

public class WithdrawTransaction {

    private BankAccount account;

    private Integer amount;

    private Date creationDate;

    public WithdrawTransaction(BankAccount account, Integer amount, Date creationDate) {
        this.account = account;
        this.amount = amount;
        this.creationDate = creationDate;
    }

    public BankAccount getAccount() {
        return account;
    }

    public Integer getAmount() {
        return amount;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
