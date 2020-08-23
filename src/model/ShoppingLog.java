package model;

import java.time.LocalDateTime;

public class ShoppingLog {
    private String shoppingId;
    private LocalDateTime shoppingDate;
    private double paidAmount ;
    private Seller seller;
    private DeliveryStatus deliveryStatus;

    public ShoppingLog(String shoppingId , double paidAmount, Seller seller, DeliveryStatus deliveryStatus) {
        //TODO ShoppingId need to be written ..
        this.shoppingId = shoppingId;
        this.shoppingDate = LocalDateTime.now();
        this.paidAmount = paidAmount;
        this.seller = seller;
        this.deliveryStatus = deliveryStatus;
    }

    public String getShoppingId() {
        return shoppingId;
    }

    public LocalDateTime getShoppingDate() {
        return shoppingDate;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public Seller getSeller() {
        return seller;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }


}
