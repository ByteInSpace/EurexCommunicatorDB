package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.Circular;

/**
 * Created by daniel on 25.02.2017.
 */

public class CircularsService {

    private List<Circular> circulars = new ArrayList<>();
    protected CircularsService() {

        Circular circular1 = new Circular();
        circular1.setReleaseDate("03 Mar 2017");
        circular1.setType("Products");
        circular1.setAutor("Eurex Exchange");
        circular1.setTitle("Equity options: Adjustment of Market Maker obligations");
        circular1.setNumber("No. 023/2017: ");
        circular1.setUrl("https://www.eurexchange.com/exchange-en/resources/circulars/Equity-options--Adjustment-of-Market-Maker-obligations/2935540");
        circular1.setTag1("Market-Making");
        circular1.setTag2("Equity");
        circular1.setTag3("Exchange");
        circular1.setFav(true);
        circular1.setImage(R.drawable.eurexclearing);
        circulars.add(circular1);

        Circular circular2 = new Circular();
        circular2.setReleaseDate("03 Mar 2017");
        circular2.setType("Releases");
        circular2.setAutor("Eurex Exchange");
        circular2.setTitle("Security update: TLS 1.0 protocol to be disabled on Eurex websites");
        circular2.setNumber("No. 022/2017: ");
        circular2.setUrl("https://www.eurexchange.com/exchange-en/resources/circulars/Security-update--TLS-1.0-protocol-to-be-disabled-on-Eurex-websites/2935494");
        circular2.setTag1("Market-Making");
        circular2.setTag2("Equity");
        circular2.setTag3("Exchange");
        circular2.setFav(true);
        circular2.setImage(R.drawable.eurex);
        circulars.add(circular2);

        Circular circular3 = new Circular();
        circular3.setReleaseDate("03 Mar 2017");
        circular3.setType("Products");
        circular3.setAutor("Eurex Exchange");
        circular3.setTitle("Eurex Daily Futures contracts on KOSPI-200 derivatives: Change of contract sizes and suspension of trading on 24 March 2017");
        circular3.setNumber("No. 021/2017: ");
        circular3.setUrl("https://www.eurexchange.com/exchange-en/resources/circulars/Eurex-Daily-Futures-contracts-on-KOSPI-200-derivatives--Change-of-contract-sizes-and-suspension-of-trading-on-24-March-2017/2935198");
        circular3.setTag1("Market-Making");
        circular3.setTag2("Equity");
        circular3.setTag3("Exchange");
        circular3.setFav(true);
        circular3.setImage(R.drawable.eurexclearing);
        circulars.add(circular3);

        Circular circular4 = new Circular();
        circular4.setReleaseDate("01 Mar 2017");
        circular4.setType("Products");
        circular4.setAutor("Eurex Exchange");
        circular4.setTitle("Withdrawal of admission of 58 Single Stock Futures");
        circular4.setNumber("No. 020/2017: ");
        circular4.setUrl("https://www.eurexchange.com/exchange-en/resources/circulars/Withdrawal-of-admission-of-58-Single-Stock-Futures/2931468");
        circular4.setTag1("Market-Making");
        circular4.setTag2("Equity");
        circular4.setTag3("Exchange");
        circular4.setImage(R.drawable.eurexclearing);
        circulars.add(circular4);

        Circular circular5 = new Circular();
        circular5.setReleaseDate("28 Feb 2017");
        circular5.setType("Releases");
        circular5.setAutor("Eurex Exchange");
        circular5.setTitle("T7 Release 5.0: Publication of documents");
        circular5.setNumber("No. 019/2017:  ");
        circular5.setUrl("https://www.eurexchange.com/exchange-en/resources/circulars/T7-Release-5.0--Publication-of-documents/2928806");
        circular5.setTag1("Market-Making");
        circular5.setTag2("Equity");
        circular5.setTag3("Exchange");
        circular5.setImage(R.drawable.eurex);
        circulars.add(circular5);

    }

    public List<Circular> getCirculars() {
        return circulars;
    }
}
