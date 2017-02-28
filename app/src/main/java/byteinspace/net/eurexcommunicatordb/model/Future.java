package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by daniel on 26.02.2017.
 */

public class Future {

    // NEW
    private String name;
    private String intervall;
    private String price;
    private String change;
    private String isin="DE00096522644";

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(String settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public String getOpenInterests() {
        return openInterests;
    }

    public void setOpenInterests(String openInterests) {
        this.openInterests = openInterests;
    }

    private String volume="56,937";
    private String lastUpdate="10/03/2017 11:10";
    private String last="139.72";
    private String high="139.93";
    private String low="139.62";
    private String settlementPrice="876,610";
    private String openInterests="56,937";



    public Future() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntervall() {
        return intervall;
    }

    public void setIntervall(String intervall) {
        this.intervall = intervall;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }


}
