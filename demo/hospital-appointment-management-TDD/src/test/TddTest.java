package test;

import main.controller.RegistrationController;
import main.model.BusinessLogic;
import main.view.LoginView;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import main.model.User;

public class TddTest {

    @Test
    public void loginTest() {
        User user = new User("username","password");

        BusinessLogic businessLogic = new BusinessLogic();

        LoginView loginView = new LoginView();

        RegistrationController registrationController = new RegistrationController(user, loginView, businessLogic);
        
        assertTrue(registrationController.updateView());
    }
}
