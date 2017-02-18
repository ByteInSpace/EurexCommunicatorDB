package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        try {
            Thread.sleep(5000);
        } catch (Exception e)
        {

        }
        Intent intent = new Intent(this, IndexTicker.class);
        startActivity(intent);
    }
}
