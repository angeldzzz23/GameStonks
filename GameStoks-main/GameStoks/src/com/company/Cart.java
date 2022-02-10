package com.company;

// the cart of the user
public class Cart {
    private Game[] games = new Game[100];
    private int itemsIntCart = 0;
    private double total = 0;

    Cart() {

    }

     void copy(Cart Copycrt) {

     }

    void addGame( Game game) {
        games[itemsIntCart] = game;
        total += game.price;
        itemsIntCart++;
    }
    double getTotal() {
        return total;
    }

    Game getGameAtIndex(int idex) {
        return  games[idex];
    }

    int getTotalItemsCount() {
        return itemsIntCart;
    }

    void showCart() {

    }

}
