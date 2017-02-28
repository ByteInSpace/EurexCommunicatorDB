package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by daniel on 28.02.2017.
 */

public class Option {
    private String name;
    private String type;
    private String volume;
    private String volume2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolume2() {
        return volume2;
    }

    public void setVolume2(String volume2) {
        this.volume2 = volume2;
    }
}
