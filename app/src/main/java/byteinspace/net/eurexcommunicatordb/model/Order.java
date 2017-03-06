package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by daniel on 02.03.2017.
 */

public class Order {
    private String amount;
    private String price;
    private String lastExecutedQty;
    private String lastExecutedPrice;
    private String leaveQty;
    private String side = "B";
    private String orderID;




    public boolean isHeader() {
        return header;
    }

    public void setHeader(boolean header) {
        this.header = header;
    }

    private boolean header = false;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLastExecutedQty() {
        return lastExecutedQty;
    }

    public void setLastExecutedQty(String lastExecutedQty) {
        this.lastExecutedQty = lastExecutedQty;
    }

    public String getLastExecutedPrice() {
        return lastExecutedPrice;
    }

    public void setLastExecutedPrice(String lastExecutedPrice) {
        this.lastExecutedPrice = lastExecutedPrice;
    }

    public String getLeaveQty() {
        return leaveQty;
    }

    public void setLeaveQty(String leaveQty) {
        this.leaveQty = leaveQty;
    }
}
