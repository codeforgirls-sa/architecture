package main.layered.domain;

import main.layered.domain.account.BankAccount;
import main.layered.domain.withdraw.WithdrawTransaction;
import main.layered.presentations.dto.WithdrawDto;

import java.util.Date;

public class BusinessLogic {


    public WithdrawTransaction createWithdrawTransaction(WithdrawDto withdrawDto) {

        if (withdrawDto.getWithdrawAmount() < 5000) {

            BankAccount bankAccount = new BankAccount(withdrawDto.getAccountNumber(), "Holder Name",
                    "600,000", "IBAN Number", "Riyadh, Saudi Arabia");

            WithdrawTransaction withdrawTransaction = new WithdrawTransaction(bankAccount, withdrawDto.getWithdrawAmount(),
                    new Date());


            return withdrawTransaction;

        } else
            throw new RuntimeException();
    }
}
