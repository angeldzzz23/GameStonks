package com.company;

import java.util.Scanner;

public class ScheduleInput {

    ScheduleInput() {

    }
    String getInput() {
        String sDate1 = "31/12/1998";
        Scanner myObj = new Scanner(System.in);
        String menu = myObj.nextLine();  // Read user input
        return menu;
    }
}
