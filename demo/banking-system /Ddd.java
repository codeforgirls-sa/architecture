package main;

import main.layered.application.BankApplication;
import main.layered.application.BankApplicationImpl;
import main.layered.presentations.dto.WithdrawDto;

public class Tdd {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplicationImpl();

        WithdrawDto withdrawDto = new WithdrawDto("112221234567", 400);
        System.out.println(bankApplication.createWithdrawTransaction(withdrawDto));
    }
}
