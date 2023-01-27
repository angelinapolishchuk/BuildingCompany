package com.solvd.construction.suppliers;

public class Suppliers {
    private int deliveryPrice;

    public Suppliers(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(int deliveryPrice) {

        this.deliveryPrice= deliveryPrice;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                ", deliveryPrice=" + deliveryPrice +
                '}';
    }
}

