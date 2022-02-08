package com.company;

// this takes in the email an password
// this class keeps track of all our users.
// function keeps track of all of users created
public class AccountsModels {

    private final User[] users = new User[100];
    private int totalUsers = 6;

    AccountsModels() {
        User usr1 = new User("angeld@gmail.com","monsterninja");
        User usr2 = new User("david@gmail.com","hahahaha");
        User usr3 = new User("ninja@gmail.com","remember?");
        User usr4 = new User("monster@gmail.com","yoooo!!No");
        User usr5 = new User("monster123@gmail.com","ComputerNumber");
        User usr6 = new User("redbull@gmail.com","Cardboard123");

        users[0] = usr1;
        users[1] = usr2;
        users[2] = usr3;
        users[3] = usr4;
        users[4] = usr5;
        users[5] = usr6;

    }


    boolean logInInfoIsCorrect(User user) {

        for (int i = 0; i < totalUsers; i++) {


            if (this.users[i].getEmail().equals(user.getEmail()) && this.users[i].getPassword().equals(user.getPassword())) {
                return true;
            }

        }

        return false;
    }

    void createNewUser(User newUser) {
        users[totalUsers] = newUser;
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
