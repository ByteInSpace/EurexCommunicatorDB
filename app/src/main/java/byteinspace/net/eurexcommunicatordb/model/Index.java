package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by daniel on 18.02.2017.
 */

public class Index {
    private String name;

    private boolean favourite = false;
    private double last_rate;
    private double increase_descrease = 0d;

    public Index(String name, double rate) {
        this.name = name;
        this.last_rate = rate;
    }

    public String getName() {
        return this.name;
    }

    public double getLastRate() {
        return this.last_rate;
    }

    public void setNewRate(double newrate) {
        increase_descrease = newrate - this.last_rate;
        this.last_rate = newrate;
    }

    public double getIncreaseDecrease() {
        return this.increase_descrease;
    }


}
