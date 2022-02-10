package com.company;

import java.io.*;
import java.util.Scanner;

// this takes in the email an password
// this class keeps track of all our users.
// function keeps track of all of users created
public class AccountsModels {

    private final User[] users = new User[100];
    private int totalUsers = 7;
    private Scanner scan = new Scanner(System.in);

    AccountsModels() {
        User usr1 = new User("angeld@gmail.com","monsterninja");
        User usr2 = new User("david@gmail.com","hahahaha");
        User usr3 = new User("ninja@gmail.com","remember?");
        User usr4 = new User("monster@gmail.com","yoooo!!No");
        User usr5 = new User("monster123@gmail.com","ComputerNumber");
        User usr6 = new User("redbull@gmail.com","Cardboard123");
        User usr7 = new User("riancorci@gmail.com", "Rkai_1073");

        users[0] = usr1;
        users[1] = usr2;
        users[2] = usr3;
        users[3] = usr4;
        users[4] = usr5;
        users[5] = usr6;
        users[6] = usr7;

    }


    boolean logInInfoIsCorrect(User user) {

        for (int i = 0; i < totalUsers; i++) {


            if (this.users[i].getEmail().equals(user.getEmail()) && this.users[i].getPassword().equals(user.getPassword())) {
                return true;
            }

        }

        return false;
    }

    void createNewUser() {
        User myUser;
        String em, pass;

        System.out.println("\n\n====================\n");
        System.out.print("Create new Account\n\nEnter a new email: ");
        em = scan.nextLine();
        System.out.print("\nEnter a new password: ");
        pass = scan.nextLine();

        myUser = new User(em, pass);

        users[totalUsers] = myUser;
        totalUsers++;
    }

    boolean userExists(User newUser) {
        for (int i = 0; i < totalUsers; i++) {
            if (newUser.isEqual(users[i])) {
                return true;
            }

        }

        return false;
    }


}
