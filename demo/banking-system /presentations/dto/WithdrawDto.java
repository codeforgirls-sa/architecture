package main.layered.presentations.dto;


public class WithdrawDto {

    private String accountNumber;

    private Integer withdrawAmount;


    public WithdrawDto(String accountNumber, Integer withdrawAmount) {
        this.accountNumber = accountNumber;
        this.withdrawAmount = withdrawAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Integer getWithdrawAmount() {
        return withdrawAmount;
    }

}
