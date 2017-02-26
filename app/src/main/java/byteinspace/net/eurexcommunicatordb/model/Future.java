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
