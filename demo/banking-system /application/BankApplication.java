package main.layered.application;

import main.layered.presentations.AccountPresentation;
import main.layered.presentations.TransferPresentation;
import main.layered.presentations.WithdrawPresentation;
import main.layered.presentations.dto.TransferDto;
import main.layered.presentations.dto.WithdrawDto;

public interface BankApplication {

    AccountPresentation getAccountInformation(String accountNumber);

    TransferPresentation createTransferTransaction(TransferDto transferDto);

    WithdrawPresentation createWithdrawTransaction(WithdrawDto withdrawDto);
}
