package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.model.Future;
import byteinspace.net.eurexcommunicatordb.model.Index;

/**
 * Created by daniel on 26.02.2017.
 */

public class ChartService {

    private List<Future> futures = new ArrayList<>();

    public ChartService() {
        createFutures();
    }

    private void createFutures() {
        Future index1 = new Future();
        index1.setName("Daily Futures in TAIEX Futures");
        index1.setIntervall("FTX Mar 2017");
        index1.setPrice("9,734.00");
        index1.setChange("-0.46");
        futures.add(index1);

        Future index2 = new Future();
        index2.setName("EURO STOXX 50 Index Futures");
        index2.setIntervall("FESX Mar 2017");
        index2.setPrice("3,315.00");
        index2.setChange("-0.63");
        futures.add(index2);

        Future index3 = new Future();
        index3.setName("Euro-Bund Futures");
        index3.setIntervall("FGBL Mar 2017");
        index3.setPrice("166,32.00");
        index3.setChange("+0.33");
        futures.add(index3);

        Future index4 = new Future();
        index4.setName("VSTOXX Futures");
        index4.setIntervall("FVS Mar 2017");
        index4.setPrice("17,45.00");
        index4.setChange("+0.29");
        futures.add(index4);
    }

    public List<Future> getFutures() {
        return this.futures;
    }

    public Future getFutureByIndex(int index) { return this.futures.get(index);}
}
