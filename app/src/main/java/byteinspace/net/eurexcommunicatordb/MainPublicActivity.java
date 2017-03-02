package byteinspace.net.eurexcommunicatordb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainPublicActivity extends BasePublicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main_public;
    }

    public void ib1Click(View view) {
        super.showNews();
    }

    public void ib2Click(View view) { }

    public void ib3Click(View view) {
        showFutures();
    }

    public void ib4Click(View view) { }

    public void ib5Click(View view) { }

    public void ib6Click(View view) {
        showLogon();
    }

    public void ib7Click(View view) { }

    public void ib8Click(View view) {
        showPress();
    }
}
