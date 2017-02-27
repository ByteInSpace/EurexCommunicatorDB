package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.model.Mailing;

/**
 * Created by daniel on 25.02.2017.
 */

public class MailingService {

    private List<Mailing> mailings = new ArrayList<>();

    public MailingService() {

        Mailing mailing1 = new Mailing();
        mailing1.setDatum("25.02.2017");
        mailing1.setRead(false);
        mailing1.setTitel("Preisänderung für ausgewählte Teilnehmer");
        mailing1.setText("Mit dem 25. Februar werden die Preise gesenkt...");
        mailing1.setUrl("http://www.eurexchange.com/exchange-en/");
        mailings.add(mailing1);

        Mailing mailing2 = new Mailing();
        mailing2.setDatum("21.02.2017");
        mailing2.setRead(true);
        mailing2.setTitel("Treffen in der Deutschen Börse");
        mailing2.setText("Ein persönliches Treffen mit den Führungskräften...");
        mailing2.setUrl("http://www.eurexchange.com/exchange-en/");
        mailings.add(mailing2);

        Mailing mailing3 = new Mailing();
        mailing3.setDatum("10.02.2017");
        mailing3.setRead(false);
        mailing3.setTitel("Firmenauto für jeden");
        mailing3.setText("Möchten Sie lieber einen BMW oder einen Audi ...");
        mailing3.setUrl("http://www.eurexchange.com/exchange-en/");
        mailings.add(mailing3);

        Mailing mailing4 = new Mailing();
        mailing4.setDatum("5.02.2017");
        mailing4.setRead(true);
        mailing4.setTitel("Neues Spiel für alle Teilnehmer");
        mailing4.setText("Gewinnen Sie eine Reise nach Eurexland ...");
        mailing4.setUrl("http://www.eurexchange.com/exchange-en/");
        mailings.add(mailing4);
    }

    public List<Mailing> getMailingsOrderByDate() {
        return this.mailings;
    }
}
