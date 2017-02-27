package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import byteinspace.net.eurexcommunicatordb.adapter.Report;

/**
 * Created by daniel on 27.02.2017.
 */

public class ReportService {

    private Map<Integer, Report> outstandingReports = new HashMap<>();

    protected ReportService() {
        Report report1 = new Report();
        report1.setId(1);
        report1.setTitle("CA05 - Capital Adjustment Series");
        report1.setExpected_final_date("20:15");
        outstandingReports.put(report1.getId(), report1);

        Report report2 = new Report();
        report2.setId(2);
        report2.setTitle("CB020 - Position Summary");
        report2.setExpected_final_date("20:15");
        outstandingReports.put(report2.getId(), report2);

        Report report3 = new Report();
        report3.setId(3);
        report3.setTitle("CB068 - Transaction Mix");
        report3.setExpected_final_date("20:15");
        outstandingReports.put(report3.getId(), report3);

        Report report4 = new Report();
        report4.setId(4);
        report4.setTitle("CB185 - Daily OTC CCP Fee Statement");
        report4.setExpected_final_date("21:15");
        outstandingReports.put(report1.getId(), report1);
    }

    public List<Report> getAllReports() {
        List<Report> reportList = new ArrayList<>();
        for (Report report : outstandingReports.values()) {
            reportList.add(report);
        }
        return reportList;
    }
}
