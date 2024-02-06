import models.Customer;
import models.Item;
import models.ItemOrder;
import models.Order;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Item i1 = new Item("Fr Rice", 340, "Rice");
        Item i2 = new Item("Coffee", 50, "Drinks");

        ItemOrder itemorder1 = new ItemOrder(i1, 3);
        ItemOrder itemorder2 = new ItemOrder(i2, 5);

        List<ItemOrder> io1 = new ArrayList<>();
        io1.add(itemorder1);
        io1.add(itemorder2);

        List<ItemOrder> io2 = new ArrayList<>();
        io2.add(itemorder1);

        Order order1 = new Order("5379", "7:13 PM", io1);
        Order order2 = new Order("5333", "7:13 PM", io2);

        List<Order> c1order = new ArrayList<>();
        c1order.add(order1);
        c1order.add(order2);

        Customer c1 = new Customer("Ram", 1000, c1order);

       c1.getAllOrders();
       order1.getDate();
    }
}