package byteinspace.net.eurexcommunicatordb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import byteinspace.net.eurexcommunicatordb.adapter.OrderBookAdapter;

public class TradingOverviewActivity extends BasePrivateActivity  implements AdapterView.OnItemSelectedListener {

    OrderBookAdapter adapterFDAX;
    OrderBookAdapter adapterODAX;
    ListView lv;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv = (ListView) findViewById(R.id.lv);
        spinner = (Spinner) findViewById(R.id.spinner1);
        String[] products = new String[]
                {"FDAX", "ODAX"};

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(TradingOverviewActivity.this, android.R.layout.simple_spinner_item, products);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        spinner.setOnItemSelectedListener(this);
        adapterFDAX = new OrderBookAdapter(this, "FDAX");
        adapterODAX = new OrderBookAdapter(this, "ODAX");
        lv.setAdapter(adapterFDAX);
    }

    protected int getContentView() {
        return R.layout.activity_trading_overview;
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                lv.setAdapter(adapterFDAX);
                break;
            case 1:
                lv.setAdapter(adapterODAX);
                break;


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        lv.setAdapter(adapterFDAX);
    }

}


