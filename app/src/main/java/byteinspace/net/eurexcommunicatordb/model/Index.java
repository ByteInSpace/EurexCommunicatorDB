package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by daniel on 18.02.2017.
 */

public class Index {
    private boolean favourite = false;
    private final String name;
    private double last_rate;

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

    public boolean setNewRate(double newrate) {
        boolean returnValue = newrate > this.last_rate;
        this.last_rate = newrate;
        return returnValue;
    }
}
