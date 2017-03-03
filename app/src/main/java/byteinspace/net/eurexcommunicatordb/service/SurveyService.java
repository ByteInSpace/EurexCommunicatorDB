package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import byteinspace.net.eurexcommunicatordb.model.Survey;

/**
 * Created by conta on 27.02.2017.
 */

public class SurveyService {

    private Map<Integer, Survey> surveys = new HashMap<>();

    public SurveyService() {
        Survey survey1 = new Survey();
        survey1.setId(1);
        survey1.setTitle("Buy Side Survey 2017");
        survey1.setDateDueTo("04.05.2017");
        survey1.setSubheadline("Eurex Clearing");
        survey1.setSurvey_state(Survey.SURVEY_STATE.OPEN);
        surveys.put(survey1.getId(), survey1);

        Survey survey2 = new Survey();
        survey2.setId(2);
        survey2.setTitle("Customer Survey 2017");
        survey2.setDateDueTo("04.05.2017");
        survey2.setSubheadline("Eurex Clearing");
        survey2.setSurvey_state(Survey.SURVEY_STATE.OPEN);
        surveys.put(survey2.getId(), survey2);


        Survey survey3 = new Survey();
        survey3.setId(3);
        survey3.setTitle("Eurex Introduction Survey 2017");
        survey3.setDateDueTo("04.05.2017");
        survey3.setSubheadline("Eurex Clearing");
        survey3.setSurvey_state(Survey.SURVEY_STATE.DONE);
        surveys.put(survey3.getId(), survey3);

        Survey survey4 = new Survey();
        survey4.setId(4);
        survey4.setTitle("Ask Side Survey 2017");
        survey4.setDateDueTo("04.01.2017");
        survey4.setSubheadline("Eurex Clearing");
        survey4.setSurvey_state(Survey.SURVEY_STATE.DONE);
        surveys.put(survey4.getId(), survey4);

    }

    public List<Survey> getAllSurveys() {
        List<Survey> surveyList = new ArrayList<>();
        for (Survey survey : surveys.values()) {
            surveyList.add(survey);
        }

        return surveyList;
    }

    public Survey getSurvey(int id) {
        return this.surveys.get(id);
    }
}
