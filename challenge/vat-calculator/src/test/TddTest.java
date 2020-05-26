package test;

import main.controller.CalculatorController;
import main.model.BusinessLogic;
import main.view.VatResultView;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import main.model.Amount;

public class TddTest {

    @Test
    public void loginTest() {
        Amount amount = new Amount(100);

        BusinessLogic businessLogic = new BusinessLogic();

        VatResultView vatResultView = new VatResultView();

        CalculatorController calculatorController = new CalculatorController(amount, vatResultView, businessLogic);

        assertTrue(calculatorController.updateView());
    }
}
