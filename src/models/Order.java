package models;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Order {
    String order_id;
    String date;
    List <ItemOrder> ordered_items;

    public Order(String order_id, String date, List<ItemOrder> ordered_items) {
        this.order_id = order_id;
        this.date = date;
        this.ordered_items = ordered_items;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ItemOrder> getOrdered_items() {
        return ordered_items;
    }

    public void setOrdered_items(List<ItemOrder> ordered_items) {
        this.ordered_items = ordered_items;
    }

    public void getDateofOrder(){
        System.out.println("-------------Date of Order---------------");
        System.out.println("Date of order:" + this.getDate());
    }
}
