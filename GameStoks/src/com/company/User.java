package com.company;

// the user class  also contains the cart total

public class User {
   private String email;
    private String passWord;
    private Boolean isLoggedIn = false;
     private  Cart cart;
     private Order []orders  = new Order[100];
     private int orderSize = 0;

    User() {
        cart = new Cart();
    }

    // getters
    String getEmail() {
        return email;
    }

    String getPassword() {
        return passWord;
    }


    Cart getCart() {
        return cart;
    }
    void createOrder(Order order) {
        orders[orderSize] = order;
        orderSize++;
    }
    int getTotalOrders() {
        return orderSize;
    }

    Order getOrderAt(int index ) {
        return orders[index];
    }

    Order getMostRecentOrder() {
        return orders[orderSize - 1];
    }

    int getOrderSize() {
       return orderSize;
    }

    // this will give an error if order size is 0
    Order getRecentOrder() {
        return orders[orderSize - 1];
    }

    double getCartTotal() {
        return cart.getTotal();
    }

    User(String _email, String _password) {
        this.email = _email;
        this.passWord = _password;
        cart = new Cart();
    }

    void addGameToCart(Game game){
        cart.addGame(game);
    }

    Game getGameAtIndex(int index) {
        return cart.getGameAtIndex(index);
    }
    int getTotalItemsInCart() {
        return cart.getTotalItemsCount();
    }


    boolean isEqual(User usr) {

        if (usr.email ==  this.email && usr.passWord == this.passWord) {
            return true;
        }
        return false;
    }

}


