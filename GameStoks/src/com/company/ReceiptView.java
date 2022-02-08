package com.company;

public class ReceiptView implements View{
    ReceiptView() {

    }


    @Override
    public void title() {
        System.out.println("receipt");
    }



    void displayReceipt(Order order) {

        System.out.println("the order receipt " + order.getOrderNumber() );
        System.out.println("Date of delivery: " + order.getDateOfDelivery());
        System.out.println(order.getOrderNumber());
        System.out.print(order.getDateOfDelivery());
        Cart cart = order.getCart();

        for(int i = 0; i < cart.getTotalItemsCount(); i++) {
            System.out.println(i + " " + cart.getGameAtIndex(i).name + " " + cart.getGameAtIndex(i).price);
        }

        System.out.println("total " + cart.getTotal());


    }

}
