package com.company;

import java.text.ParseException;

public class Controller {
        User user;
        AccountsModels account; // this is where all of
        String border = "\n\n====================\n";

    Controller() throws ParseException {

        // TODO: implement an infinite loop

        // this initializes all of users
        // if you want to use files, create a method that the array inside of this
        account = new AccountsModels();

        // logging controller
        LogginInController logControl = new LogginInController(account);
        user = logControl.getCurrentUser();
        System.out.println(border);

        // adding products to cart
        ControllerStore controllgerStore = new ControllerStore(user);
        user = controllgerStore.getCurrentUser();
        System.out.println(border);

        // continue to delivery options
        ScheduledDeliveryController schedule = new ScheduledDeliveryController();

        // creates an order
        Order order = new Order(schedule.getDate(),user.getCart());

        // creates the order for the user
        user.createOrder(order);

        // display the the receipt to the user
        ReceiptController receiptController = new ReceiptController(user);

    }

}





