package com.company;

public class DateView implements View {
    // constructor
    DateView() {

    }
    void enterDateDisplay() {
        System.out.println("Checkout/Delivery\n\nEnter date in this format: MM/dd/yyyy");
    }


    void dateIsBeforeTodayError() {
        System.out.println("Date is before. Try again!");
    }

    void invalidInput() {
        System.out.println("Invalid input");
    }

    @Override
    public void title() {
        System.out.println("Choosing Date");
    }
}


