package com.company;

public class ReceiptView implements View{
    ReceiptView() {

    }


    @Override
    public void title() {
        System.out.println("receipt");
    }



    void displayReceipt(Order order) {
        System.out.println("\n\n===============================================\n");
        System.out.println("Order number: " + order.getOrderNumber());
        System.out.println("Date of delivery: " + order.getDateOfDelivery() + "\n");
        Cart cart = order.getCart();

        for(int i = 0; i < cart.getTotalItemsCount(); i++) {
            System.out.printf("%d. %-25s        $%3d%n", i, cart.getGameAtIndex(i).name, cart.getGameAtIndex(i).price);
        }

        System.out.println("\ntotal $" + cart.getTotal());


    }

}
