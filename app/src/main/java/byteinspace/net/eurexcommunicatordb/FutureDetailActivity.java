package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import byteinspace.net.eurexcommunicatordb.model.Future;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

public class FutureDetailActivity extends BasePublicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int futureid = intent.getIntExtra("EVENTID", 0);
        Future future = ServiceFactory.getFactory().getFuturesService().getFutureByIndex(futureid);
        if (null == future) { // To avoid possible errors
            future = ServiceFactory.getFactory().getFuturesService().getFutureByIndex(1);
        }

        final TextView name = (TextView) findViewById(R.id.future_name);
        name.setText(future.getName());

        final TextView future_isin = (TextView) findViewById(R.id.future_isin);
        future_isin.setText("ISIN " + future.getIsin());

        final TextView future_volume = (TextView) findViewById(R.id.future_volume);
        future_volume.setText("Volume " + future.getVolume());

        final TextView future_price = (TextView) findViewById(R.id.future_price);
        future_price.setText(future.getPrice() + " EUR");

        final TextView future_diff = (TextView) findViewById(R.id.future_diff);
        future_diff.setText(future.getChange());
        if (Float.valueOf(future.getChange()) >= 0) {
            future_diff.setBackgroundColor(Color.GREEN);
        } else {
            future_diff.setBackgroundColor(Color.RED);
        }

        final TextView future_last_update = (TextView) findViewById(R.id.future_last_update);
        future_last_update.setText(future.getLastUpdate());

        final TextView future_last = (TextView) findViewById(R.id.future_last);
        future_last.setText(future.getLast());

        final TextView future_high = (TextView) findViewById(R.id.future_high);
        future_high.setText(future.getHigh());

        final TextView future_low = (TextView) findViewById(R.id.future_low);
        future_low.setText(future.getLow());

        final TextView future_settlement = (TextView) findViewById(R.id.future_settlement);
        future_settlement.setText(future.getSettlementPrice());

        final TextView future_openinterests = (TextView) findViewById(R.id.future_openinterests);
        future_openinterests.setText(future.getOpenInterests());

        final TextView future_volume_contract = (TextView) findViewById(R.id.future_volume_contract);
        future_volume_contract.setText(future.getVolume());

        final ImageView futureChart = (ImageView) findViewById(R.id.chart);
        futureChart.setImageResource(future.getChart());

    }

    @Override protected int getContentView() {
        return R.layout.activity_future_detail;
    }
}
