package com.company;

public class LogInView implements View {

    LogInView() {

    }

    @Override
    public void title() {
        System.out.println("Logging in");
    }

    void showMenu() {
        System.out.println("Logging in");
        System.out.println("1. Log in");
        System.out.println("2. Creating an account");
    }

    void askForEmail() {
       System.out.println("enter your email: ");
    }

    void askForPassword() {
        System.out.println("enter your password: ");
    }

}
