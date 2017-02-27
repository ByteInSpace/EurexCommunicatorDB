package byteinspace.net.eurexcommunicatordb.adapter;

/**
 * Created by daniel on 27.02.2017.
 */

public class Report {

    private int id;
    private String title;
    private String expected_final_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExpected_final_date() {
        return expected_final_date;
    }

    public void setExpected_final_date(String expected_final_date) {
        this.expected_final_date = expected_final_date;
    }
}
