package main.controller;

import main.model.BusinessLogic;
import main.model.Amount;
import main.view.VatResultView;

public class CalculatorController {

    private Amount amount;

    private BusinessLogic businessLogic;

    private VatResultView vatResultView;

    public CalculatorController(Amount amount, VatResultView vatResultView, BusinessLogic businessLogic) {
        this.amount = amount;
        this.vatResultView = vatResultView;
        this.businessLogic = businessLogic;
    }

    public boolean updateView(){
        vatResultView.getVatResult(businessLogic.calculateVat(amount));
        return true;
    }
}