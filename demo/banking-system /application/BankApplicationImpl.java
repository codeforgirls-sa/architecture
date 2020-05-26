package main.layered.application;

import main.layered.domain.BusinessLogic;
import main.layered.domain.account.BankAccount;
import main.layered.domain.transfer.TransferTransaction;
import main.layered.domain.withdraw.WithdrawTransaction;
import main.layered.presentations.AccountPresentation;
import main.layered.presentations.TransferPresentation;
import main.layered.presentations.WithdrawPresentation;
import main.layered.presentations.dto.TransferDto;
import main.layered.presentations.dto.WithdrawDto;

import java.util.Date;

public class BankApplicationImpl implements BankApplication {

    private BusinessLogic businessLogic = new BusinessLogic();


    @Override
    public AccountPresentation getAccountInformation(String accountNumber) {
        return null;
    }

    @Override
    public TransferPresentation createTransferTransaction(TransferDto transferDto) {
        return null;
    }

    @Override
    public WithdrawPresentation createWithdrawTransaction(WithdrawDto withdrawDto) {

        WithdrawTransaction withdrawTransaction = this.businessLogic.createWithdrawTransaction(withdrawDto);

        WithdrawPresentation withdrawPresentation = new WithdrawPresentation();
        withdrawPresentation.setAccountNumber(withdrawTransaction.getAccount().getAccountNumber());
        withdrawPresentation.setWithdrawAmount(withdrawTransaction.getAmount());
        withdrawPresentation.setCurrentBalance(withdrawTransaction.getAccount().getBalance());
        withdrawPresentation.setTransactionDate(withdrawTransaction.getCreationDate());
        withdrawPresentation.setAtmNumber("S1964");

        return withdrawPresentation;
    }
}
