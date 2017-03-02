package byteinspace.net.eurexcommunicatordb.model;

import android.util.ArrayMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import byteinspace.net.eurexcommunicatordb.model.Order;

/**
 * Created by daniel on 02.03.2017.
 */

public class TradingOverviewProducts {

    private String product;
    private List<Order> orders = new ArrayList<>();

    public TradingOverviewProducts() {
        Order order0 = new Order();
        order0.setAmount("Amount");
        order0.setPrice("Price");
        order0.setLastExecutedQty("ExecutedQty");
        order0.setLastExecutedPrice("ExecutedPrice");
        order0.setLeaveQty("LeaveQty");
        order0.setOrderID("OrderID");
        order0.setHeader(true);
        orders.add(order0);

    }


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
