package com.company;

public class Order {
    private int orderNumber;
    private Cart cart; // this gives us the
    private String dateOfDelivery; // the date of delivery

    void setDateOfDelivery(String _dateOfDelivery) {
        this.dateOfDelivery = _dateOfDelivery;
    }
    // this is pass by reference, so might want to use a copy constructor
    // however, this will do for now, since im pretty tired.
    void setCart(Cart _cart) {
        this.cart = _cart;
    }

    private static int incrementor = 1;

    // sets
    // initializer for order
    Order(String _dateOfDelivery, Cart _cart) {
        orderNumber = incrementor;
        incrementor += 1;

        // initializing our variables=
        this.dateOfDelivery = _dateOfDelivery;
        this.cart = _cart;

    }


    Cart getCart() {
        return cart;
    }

    // returns the order number to the user
    int getOrderNumber() {
        return orderNumber;
    }

    String getDateOfDelivery() {
        return dateOfDelivery;
    }



}
