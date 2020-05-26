package main.layered.domain.account;


public class BankAccount {

    private String accountNumber;

    private String cardHolderName;

    private String balance;

    private String iban;

    private String cardHolderAddress;

    public BankAccount(String accountNumber, String cardHolderName, String balance, String iban, String cardHolderAddress) {
        this.accountNumber = accountNumber;
        this.cardHolderName = cardHolderName;
        this.balance = balance;
        this.iban = iban;
        this.cardHolderAddress = cardHolderAddress;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getBalance() {
        return balance;
    }

    public String getIban() {
        return iban;
    }

    public String getCardHolderAddress() {
        return cardHolderAddress;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
