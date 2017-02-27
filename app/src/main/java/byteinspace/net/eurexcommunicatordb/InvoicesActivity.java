package byteinspace.net.eurexcommunicatordb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.InvoiceAdapter;

public class InvoicesActivity extends BasePrivateActivity {

    InvoiceAdapter adapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoices);

        adapter = new InvoiceAdapter(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_invoice);

        lv = (ListView) findViewById(R.id.list_invoice);
        lv.setAdapter(adapter);

        showToolbar(toolbar);
    }
}
