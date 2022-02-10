package com.company;


// storeview handles the entirery of the view
// how the view looks
public class StoreView implements View {


    @Override
    public void title() {
        System.out.println("Selected games!!");
    }

    // displays the list of games
    void displayListGames(Store str) {
        // the user input
        for (int i = 0; i <str.getTotalSizeGames(); i++ ) {
            System.out.printf("%d. %-25s        $%3d%n", i, str.getGameAtIndex(i).name, str.getGameAtIndex(i).price);
        }
    }

    void askUserForInput() {
        System.out.println("\nEnter an index to add to cart (or enter -1 to check out): ");
    }

    void displayInsufficientInventFor(Game game) {
        System.out.println("not enough inventory for " + game.name);
    }

    // this displays all of the items that the user has in their
    void displayCartItems(User user) {
        // display cart
        System.out.println("\n\n============================================================\n");
        System.out.println("Cart: " + user.getTotalItemsInCart() + " items\n");

        for(int i = 0; i < user.getTotalItemsInCart(); i++) {
            System.out.printf("%d. %-25s        $%3d%n", i, user.getGameAtIndex(i).name, user.getGameAtIndex(i).price);
            //System.out.println(i + ". " + user.getGameAtIndex(i).name + " $" + user.getGameAtIndex(i).price);
        }

        System.out.println("\nTotal: " + user.getCart().getTotal() + "      -  -  -  -  -  -  -  -  -  -  -\n\n");
    }

    // this is the store
    void StoreView() {

    }
}
