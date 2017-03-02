package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.Press;

/**
 * Created by daniel on 02.03.2017.
 */

public class PressService {

    private List<Press> press = new ArrayList<>();

    protected PressService() {

        Press press1 = new Press();
        press1.setId(1);
        press1.setDate("02. Mar 2017");
        press1.setAuthor("Eurex Group");
        press1.setTitle("Monthly Report: Eurex records strong volumes in VSTOXX® products");
        press1.setUrl("http://www.eurexgroup.com/group-en/newsroom/press-releases/Monthly-Report--Eurex-records-strong-volumes-in-VSTOXX--products/2933160");
        press1.setImage(R.drawable.news1);
        press.add(press1);

        Press press2 = new Press();
        press2.setId(1);
        press2.setDate("01. Mar 2017");
        press2.setAuthor("Eurex Bonds");
        press2.setTitle("Turnover on Eurex Bonds in February 2017");
        press2.setUrl("http://www.eurexgroup.com/group-en/newsroom/press-releases/Turnover-on-Eurex-Bonds-in-February-2017/2931452");
        press2.setImage(R.drawable.news2);
        press.add(press2);

        Press press3 = new Press();
        press3.setId(1);
        press3.setDate("02. Mar 2017");
        press3.setAuthor("Eurex Group");
        press3.setTitle("Total Return Futures notional value exceeds one billion Euro");
        press3.setUrl("http://www.eurexgroup.com/group-en/newsroom/press-releases/Total-Return-Futures-notional-value-exceeds-one-billion-Euro/2905722");
        press3.setImage(R.drawable.news3);
        press.add(press3);

        Press press4 = new Press();
        press4.setId(1);
        press4.setDate("03. Feb 2017");
        press4.setAuthor("Eurex Bonds");
        press4.setTitle("Turnover on Eurex Bonds in January 2017");
        press4.setUrl("http://www.eurexgroup.com/group-en/newsroom/press-releases/Turnover-on-Eurex-Bonds-in-January-2017/2914416");
        press4.setImage(R.drawable.news4);
        press.add(press4);

        Press press5 = new Press();
        press5.setId(1);
        press5.setDate("25. Jan 2017");
        press5.setAuthor("Eurex Exchange");
        press5.setTitle("Eurex Exchange Council elects Carola Gräfin von Schmettow as chairman");
        press5.setUrl("http://www.eurexgroup.com/group-en/newsroom/press-releases/Eurex-Exchange-Council-elects-Carola-Graefin-von-Schmettow-as-chairman/2888112");
        press5.setImage(R.drawable.news5);
        press.add(press5);

        Press press6 = new Press();
        press6.setId(1);
        press6.setDate("23. Jan 2017");
        press6.setAuthor("Eurex Clearing");
        press6.setTitle("Deutsche Börse presents blockchain concept for risk free cash transfer");
        press6.setUrl("http://www.eurexgroup.com/group-en/newsroom/press-releases/Deutsche-Boerse-presents-blockchain-concept-for-risk-free-cash-transfer/2883728");
        press6.setImage(R.drawable.news1);
        press.add(press6);

    }

    public List<Press> getAllPressOrderedByDate() {
        return press;

    }
}
