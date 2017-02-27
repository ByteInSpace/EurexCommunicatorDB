package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by conta on 27.02.2017.
 */

public class Survey {

    public static enum SURVEY_STATE {
        EXPIRED, DONE, PENDING;
    }
    private int id;
    private String title;
    private String dateDueTo;
    private String subheadline;
    private SURVEY_STATE survey_state;

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

    public String getDateDueTo() {
        return dateDueTo;
    }

    public void setDateDueTo(String dateDueTo) {
        this.dateDueTo = dateDueTo;
    }

    public String getSubheadline() {
        return subheadline;
    }

    public void setSubheadline(String subheadline) {
        this.subheadline = subheadline;
    }

    public SURVEY_STATE getSurvey_state() {
        return survey_state;
    }

    public void setSurvey_state(SURVEY_STATE survey_state) {
        this.survey_state = survey_state;
    }
}
