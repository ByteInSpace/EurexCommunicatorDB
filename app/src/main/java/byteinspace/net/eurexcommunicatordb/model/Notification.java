package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by conta on 01.03.2017.
 */

public class Notification {

    public static enum LEVEL { URGENT, MIDDLE, LOW }
    private LEVEL level;
    private String date;
    private String title;
    private boolean read;

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public LEVEL getLevel() {
        return level;
    }

    public void setLevel(LEVEL level) {
        this.level = level;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
