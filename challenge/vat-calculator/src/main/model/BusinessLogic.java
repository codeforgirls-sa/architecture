package main.model;

public class BusinessLogic {

    public double calculateVat(Amount amount){

        if (  amount.getValue() > 0)
            return (amount.getValue() * 0.15);
        else
            throw new RuntimeException();

    }

}
