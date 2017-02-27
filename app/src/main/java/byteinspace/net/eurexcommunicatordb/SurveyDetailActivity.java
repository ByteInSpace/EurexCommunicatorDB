package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import byteinspace.net.eurexcommunicatordb.model.Survey;
import byteinspace.net.eurexcommunicatordb.model.User;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 27.02.2017.
 */

public class SurveyDetailActivity extends BasePrivateActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_detail);

        Intent intent = getIntent();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_srv_detail);

        int surveyid = intent.getIntExtra("ID", 0);
        String userid = intent.getStringExtra("USERID");

        Survey survey = ServiceFactory.getFactory().getSurveyService().getSurvey(surveyid);

        final TextView surveyName = (TextView) findViewById(R.id.srv_detail_name);
        surveyName.setText(survey.getTitle());

        showToolbar(toolbar);
    }
}