package com.company;

public class ControllerStore {
    User user;

    // gets a user
    void setCurrentUser(User user) {
        this.user = user;
    }

    // returns a user
    User getCurrentUser() {
        return user;
    }

    ControllerStore(User _user) {
        this.user = _user;

        Store store = new Store();
        StoreView strview = new StoreView();
        StoreInput str = new StoreInput();
        String input = "";

        do {
            strview.displayCartItems(user);

            // end of display cart
            strview.displayListGames(store);
            strview.askUserForInput();
            input = str.storeInput();

            // get correct input validation
            if (validInput(store,input) == false) {
                continue;
            }

            // checks if input is -1,
            if (input.equals("-1")) {
                continue;
            }

            // check if there is enough inventory
            // if input is -1 here, program crashes
            if (!store.gameHasEnoughinventory(Integer.parseInt(input))) {
                strview.displayInsufficientInventFor(store.getGameAtIndex(Integer.parseInt(input)));
                continue;
            }

            // add the game to cart
            if (!input.equals("-1")) {
                // add game to cart
                user.addGameToCart(store.getGameAtIndex(Integer.parseInt(input)));
            }

            //
        }while(!input.equals("-1"));
    }

    // TODO:
    boolean validInput(Store str, String input) {

        if (input.equals(-1)) {

            return true;
        }

        // TODO: check if input is a number
        // if it a number,convert inpput to in
        //   check if it's less than str.getTotalSizeGames() but greater than or equal to zero

        return true;
    }

}
