package model;

import java.time.LocalDateTime;
import java.util.HashMap;

public class SellingLog {
    private String SellingId;
    private LocalDateTime sellingDate;
    private double price;
    private double offPrice;
    private HashMap<Good , Integer> goods;
    private Customer customer;
    private DeliveryStatus deliveryStatus;

    public SellingLog(String sellingId,
                      double price,
                      double offPrice,
                      HashMap<Good, Integer> goods,
                      Customer customer,
                      DeliveryStatus deliveryStatus) {
        //TODO need to be written...
        SellingId = sellingId;
        this.sellingDate = LocalDateTime.now();
        this.price = price;
        this.offPrice = offPrice;
        this.goods = goods;
        this.customer = customer;
        this.deliveryStatus = deliveryStatus;
    }

    public String getSellingId() {
        return SellingId;
    }

    public LocalDateTime getSellingDate() {
        return sellingDate;
    }

    public double getPrice() {
        return price;
    }

    public double getOffPrice() {
        return offPrice;
    }

    public HashMap<Good, Integer> getGoods() {
        return goods;
    }

    public Customer getCustomer() {
        return customer;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }
}
