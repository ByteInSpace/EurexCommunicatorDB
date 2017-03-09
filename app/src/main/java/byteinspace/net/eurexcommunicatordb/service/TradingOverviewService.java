package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import byteinspace.net.eurexcommunicatordb.model.Order;
import byteinspace.net.eurexcommunicatordb.model.TradingOverviewProducts;

/**
 * Created by daniel on 02.03.2017.
 */

public class TradingOverviewService {

    private Map<String, TradingOverviewProducts> products = new HashMap<>();

    TradingOverviewService() {

        TradingOverviewProducts product1 = new TradingOverviewProducts();
        product1.setProduct("FDAX");



        Order order1 = new Order();
        order1.setAmount("5000");
        order1.setPrice("12.53 EUR");
        order1.setLastExecutedQty("0");
        order1.setLastExecutedPrice("0");
        order1.setLeaveQty("B");
        order1.setOrderID("458943896");
        product1.getOrders().add(order1);

        Order order2 = new Order();
        order2.setAmount("5000");
        order2.setPrice("13.53 EUR");
        order2.setLastExecutedQty("2000");
        order2.setLastExecutedPrice("13.21");
        order2.setLeaveQty("B");
        order2.setSide("S");
        order2.setOrderID("458942343");
         product1.getOrders().add(order2);

        Order order3= new Order();
        order3.setAmount("5000");
        order3.setPrice("12.53 EUR");
        order3.setLastExecutedQty("0");
        order3.setLastExecutedPrice("0");
        order3.setLeaveQty("S");
        order3.setOrderID("458924123");
        product1.getOrders().add(order3);

        products.put(product1.getProduct(), product1);

        TradingOverviewProducts product2 = new TradingOverviewProducts();
        product2.setProduct("ODAX");

        Order order4 = new Order();
        order4.setAmount("5000");
        order4.setPrice("22.53 EUR");
        order4.setLastExecutedQty("0");
        order4.setLastExecutedPrice("0");
        order4.setLeaveQty("B");
        order4.setOrderID("458943896");
        product2.getOrders().add(order4);

        Order order5 = new Order();
        order5.setAmount("5000");
        order5.setPrice("23.53 EUR");
        order5.setLastExecutedQty("2000");
        order5.setLastExecutedPrice("23.21");
        order5.setLeaveQty("S");
        order5.setSide("S");
        order5.setOrderID("458943566");
        product2.getOrders().add(order5);

        Order order6= new Order();
        order6.setAmount("5000");
        order6.setPrice("22.53 EUR");
        order6.setLastExecutedQty("0");
        order6.setLastExecutedPrice("0");
        order6.setLeaveQty("B");
        order6.setOrderID("4583453896");
        product2.getOrders().add(order6);

        products.put(product2.getProduct(), product2);
    }

    public List<String> getAllProducts() {
        List<String> productList = new ArrayList<String>() ;
        for (String product : products.keySet()) {
            productList.add(product);
        }
        return productList;
    }

    public List<Order> getAllOrdersForProduct(String product) {
        return this.products.get(product).getOrders();
    }

}