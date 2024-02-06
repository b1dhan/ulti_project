package models;

import java.util.List;

public class Customer {
    String name;
    int balance;
    List<Order> orderedlist;

    public Customer(String name, int balance, List<Order> orderedlist) {
        this.name = name;
        this.balance = balance;
        this.orderedlist = orderedlist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Order> getOrderedlist() {
        return orderedlist;
    }

    public void setOrderedlist(List<Order> orderedlist) {
        this.orderedlist = orderedlist;
    }

    public void getAllOrders(){
        System.out.println("-------------Orders---------------");

        for (Order o : this.getOrderedlist()) {
            System.out.println("OrderId: " + o.getOrder_id());
            System.out.println("Name \t \t \t \t  \t Quantity");
            for (ItemOrder i : o.getOrdered_items()) {
                System.out.println(i.getItem().getName() + "\t \t \t \t \t " + i.getQuantity());
                System.out.println("-------------------------------------");
            }
        }
    }
}
