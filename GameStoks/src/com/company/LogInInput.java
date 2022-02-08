package com.company;
import java.util.Scanner;

public class LogInInput {

    // gets the email from the user
    String getEmail() {
        Scanner myObj = new Scanner(System.in);
        String email = myObj.nextLine();  // Read user input
        return email;
    }
    // gets the password
    String getPassWord() {
        Scanner myObj = new Scanner(System.in);
        String password = myObj.nextLine();  // Read user input
        return password;
    }

    String getInputFromMenu() {
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();  // Read user input
        return input;
    }

}
