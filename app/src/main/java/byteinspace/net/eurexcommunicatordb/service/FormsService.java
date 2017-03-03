package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.model.Form;

/**
 * Created by daniel on 03.03.2017.
 */

public class FormsService {

    List<Form> forms = new ArrayList<>();

    protected FormsService() {

        Form form1 = new Form();
        form1.setLastUpdate("28. Feb 2017");
        form1.setTag1("Zulassung");
        form1.setTag2("Recht");
        form1.setTag3("IRS");
        form1.setTitle("Clearing Vereinbarung zwischen ECAG und einem CM");
        form1.setDownloadLink("http://forms.eurexchange.com/xfmws/binary/de/07_Markets_Services_-_Member_Services_+_Admission/Clearing/ALL_Clearing_Vereinbarung_deutsch.pdf");
        forms.add(form1);

        Form form2 = new Form();
        form2.setLastUpdate("27. Feb 2017");
        form2.setTag1("FFI");
        form2.setTag2("QIC");
        form2.setTag3("English");
        form2.setTitle("Withholding Statement - FFI - QIC - segregated account (only English version available)");
        form2.setDownloadLink("http://forms.eurexchange.com/xfmws/binary/de/07_Markets_Services_-_Member_Services_+_Admission/Clearing/Withholding%20Statement%20-%20FFI%20-%20QIC%20-%20segregated%20account%20(only%20English%20version%20available).pdf");
        forms.add(form2);

        Form form3 = new Form();
        form3.setLastUpdate("23. Feb 2017");
        form3.setTag1("Technic");
        form3.setTag2("CCP");
        form3.setTag3("Report");
        form3.setTitle("Order Form for Setup/Change/Cancellation of CCP Settlement Reports File Transfer via z/OS (SNA) or SWIFTnet");
        form3.setDownloadLink("http://forms.eurexchange.com/xfmws/binary/de/07_Markets_Services_-_Member_Services_+_Admission/Clearing/Order%20Form%20for%20Setup-Change-Cancellation%20of%20%20CCP%20Settlement%20Reports%20File%20Transfer%20via%20z-OS%20(SNA)%20or%20SWIFTnet.pdf");
        forms.add(form3);


        Form form4 = new Form();
        form4.setLastUpdate("08. Feb 2017");
        form4.setTag1("Zulassung");
        form4.setTag2("Recht");
        form4.setTag3("IRS");
        form4.setTitle("Clearing Vereinbarung mit einem NCM/RC für das ICM unter ECD");
        form4.setDownloadLink("http://forms.eurexchange.com/xfmws/binary/de/07_Markets_Services_-_Member_Services_+_Admission/Clearing/Clearing%20Vereinbarung%20mit%20einem%20NCM-RC%20fur%20das%20ICM%20unter%20ECD.pdf");
        forms.add(form4);


        Form form5 = new Form();
        form5.setLastUpdate("07. Feb 2017");
        form5.setTag1("Zulassung");
        form5.setTag2("Mitgliedschaft");
        form5.setTag3("Frankfurt");
        form5.setTitle("Consent Letter Eurex Frankfurt (only English version available)");
        form5.setDownloadLink("http://forms.eurexchange.com/xfmws/binary/de/07_Markets_Services_-_Member_Services_+_Admission/Eurex/Consent%20Letter%20Eurex%20Frankfurt%20(only%20English%20version%20available).pdf");
        forms.add(form5);


        Form form6 = new Form();
        form6.setLastUpdate("07. Feb 2017");
        form6.setTag1("Zulassung");
        form6.setTag2("Recht");
        form6.setTag3("IRS");
        form6.setTitle("Consent Letter Eurex Zürich (only English version available)");
        form6.setDownloadLink("http://forms.eurexchange.com/xfmws/binary/de/07_Markets_Services_-_Member_Services_+_Admission/Eurex/Consent%20Letter%20Eurex%20Zurich%20(only%20English%20version%20available).pdf");
        forms.add(form6);


    }

    public List<Form> getAllForms() {
        return forms;
    }
}
