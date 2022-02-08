package com.company;

// this is the game class, this constitute a class of what it is to be a game.
class Game {
    String name;
    int price;
    int inventory;

    // this is the set up for the game
    Game(String _name, int _price, int _inventory) {
        this.name = _name;
        this.price = _price;
        this.inventory = _inventory;
    }

    boolean hasEnoughInventory() {
        if (inventory > 0) {
            return true;
        }
        return false;
    }

    void decreaseInventory() {
        inventory -= 1;
    }

}

// this constitutes what it is to be a store
public class Store {
    // TODO: can probably replace with vector
    private final Game[] games = new Game[100];
    private int totalGames = 5;

    Store() {
        // here you can paste the amount files that you want
        Game game1 = new Game("red dead redemeption", 60, 30);
        Game game2 = new Game("Minecraft", 60, 30);
        Game game3 = new Game("GTA 5", 90, 0);
        Game game4 = new Game("COD 3", 60, 15);
        Game game5 = new Game("cod 2", 25, 30);
        SpecialEdition game6Lit = new SpecialEdition("GT5 limited edition", 300, 30,"red hat");

        games[0] = game1;
        games[1] = game2;
        games[2] = game3;
        games[3] = game4;
        games[4] = game5;
    }


    int getTotalSizeGames() {
        return totalGames;
    }


    // checks if game has enough inventory
    boolean gameHasEnoughinventory(int index) {

        return games[index].hasEnoughInventory();
    }

    // decreases the inventory of all
    void buyGamesAtIndex(Game[] allGames, int size) {

        for (int i = 0; i < size; i++) {
            allGames[i].decreaseInventory();
        }

    }

    Game getGameAtIndex(int index) {
        // TODO: input validation for index
        return games[index];
    }

}

// an extenstion of game
class SpecialEdition extends Game {
    String actionFigures;

    // the constructure for the special edition action figures
    SpecialEdition(String _name, int _price, int _inventory,String _actionFigures) {
        super(_name, _price, _inventory);
        this.actionFigures = _actionFigures;
    }
}






