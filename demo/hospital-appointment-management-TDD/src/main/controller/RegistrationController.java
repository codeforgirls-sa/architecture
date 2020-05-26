package main.controller;

import main.model.BusinessLogic;
import main.model.User;
import main.view.LoginView;

public class RegistrationController{

    private User user;

    private BusinessLogic businessLogic;

    private LoginView loginView;

    public RegistrationController(User user, LoginView loginView, BusinessLogic businessLogic) {
        this.user = user;
        this.loginView = loginView;
        this.businessLogic = businessLogic;
    }

    public boolean updateView(){
        loginView.successLogin(businessLogic.login(user));
        return true;
    }
}