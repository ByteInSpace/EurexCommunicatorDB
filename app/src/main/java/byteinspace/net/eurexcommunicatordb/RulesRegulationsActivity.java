package byteinspace.net.eurexcommunicatordb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.RuleAdapter;

public class RulesRegulationsActivity extends BasePublicActivity {

    RuleAdapter adapter;

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv = (ListView) findViewById(R.id.lv);
        adapter = new RuleAdapter(this);
        lv.setAdapter(adapter);


    }

    @Override protected int getContentView() {
        return R.layout.activity_rules_regulations;
    }
}
