package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.MailingsAdapter;
import byteinspace.net.eurexcommunicatordb.model.Mailing;

public class MailingActivity extends BasePrivateActivity {

    MailingsAdapter adapter;

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new MailingsAdapter(this);


        lv = (ListView) findViewById(R.id.list_mailings);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Mailing mailing = (Mailing) adapter.getItem(position);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(mailing.getUrl()));
                startActivity(i);
            }
        });



    }

    @Override protected int getContentView() {
        return R.layout.activity_mailing;
    }
}
