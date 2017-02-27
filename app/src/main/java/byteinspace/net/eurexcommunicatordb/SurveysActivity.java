package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.SurveyAdapter;
import byteinspace.net.eurexcommunicatordb.model.Survey;

public class SurveysActivity  extends BasePrivateActivity {

    SurveyAdapter adapter;


    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surveys);

        adapter = new SurveyAdapter(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_surveys);

        lv = (ListView) findViewById(R.id.list_surveys);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showSurveyRegistration(id);
            }
        });


        showToolbar(toolbar);
    }

    private void showSurveyRegistration(long id) {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, SurveyDetailActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        Survey survey = (Survey) adapter.getItem((int) id);
        intent.putExtra("ID", survey.getId());
        startActivity(intent);



    }

}