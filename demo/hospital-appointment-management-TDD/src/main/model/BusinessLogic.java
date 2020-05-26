package main.model;

public class BusinessLogic {

    public String login(User user){

        if ( ! user.getUserName().isEmpty() &&  ! user.getPassword().isEmpty() && isUserRegistered(user))
            return user.getUserName();
        else
            throw new RuntimeException();

    }

    public static boolean isUserRegistered(User user){
        return user.getUserName().equalsIgnoreCase("username") && user.getPassword().equals("password");
    }
}
