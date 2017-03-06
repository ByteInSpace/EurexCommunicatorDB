package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by daniel on 04.03.2017.
 */

public class Rule {
    private String title;

    public Rule(String title) {
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
