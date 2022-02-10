package com.company;


public class LogginInController implements  UserInfo {

    private User usr; // the user that is currenly logged in
    private AccountsModels am; // for createNewUser function

    // takes care of the loggin of the user
    private User loggingInTheUser() {

        LogInView logView = new LogInView();
        logView.title();
        EmailValidation  email = new EmailValidation();
        LogInInput input = new LogInInput();
        boolean isValidEmail = false;

        String pass;
        String emai;

            System.out.println("\n\n====================\n");

        do {

            logView.askForEmail();
            emai = input.getEmail();
            isValidEmail = EmailValidation.validate(emai);
        } while(isValidEmail == false);

        logView.askForPassword();
        pass = input.getPassWord();

        User user = new User(emai, pass);

        return  user;
    }

    private void actOnMenu() {
        LogInView logView = new LogInView();
        logView.showMenu();


    }

    private void createAccount() {
       // TODO:
    }

    private void logInUser(AccountsModels account) {
        // loggin in the user
        do {

            usr = loggingInTheUser();

        } while(account.logInInfoIsCorrect(usr) == false);
    }

    LogginInController(AccountsModels acc) {

        LogInInput input = new LogInInput();
        LogInView logView = new LogInView();
        logView.showMenu();
        String n = input.getInputFromMenu();

        // perform action

        switch (n) {
            case "1": // logging in
                logInUser(acc);
                break;
            case  "2":  // creating an account
                acc.createNewUser();
                logInUser(acc);
                break;
        }

        // ask the user to log in
        AccountsModels account = acc;




    }


    User getCurrentUser() {
        return usr;
    }


}
