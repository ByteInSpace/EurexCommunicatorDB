package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.PressAdapter;
import byteinspace.net.eurexcommunicatordb.model.Press;

public class PressActivity extends BasePublicActivity {

    PressAdapter adapter;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv = (ListView) findViewById(R.id.lv);
        adapter = new PressAdapter(this);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Press press = (Press) adapter.getItem(position);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(press.getUrl()));
                startActivity(i);
            }
        });
    }

    @Override protected int getContentView() {
        return R.layout.activity_press;
    }
}
