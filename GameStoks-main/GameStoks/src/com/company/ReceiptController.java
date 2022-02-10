package com.company;

// is in charge of displaying receipt to the user
public class ReceiptController {
    // constructor for the receipt of the user
    ReceiptController(User usr) {
        // get the most recent order from the user
        // set up view
        ReceiptView view = new ReceiptView();

        Order order = usr.getMostRecentOrder();
        view.displayReceipt(order);

    }

}
