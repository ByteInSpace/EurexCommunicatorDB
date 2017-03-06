package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.model.Rule;

/**
 * Created by daniel on 04.03.2017.
 */

public class RulesService {

    private List<Rule> rules = new ArrayList<>();

    protected RulesService() {
        rules.add(new Rule("Exchange rules"));
        rules.add(new Rule("Clearing Conditions"));
        rules.add(new Rule("Trade Entry Service"));
        rules.add(new Rule("Contract Specifications"));
        rules.add(new Rule("Mistrade regulations"));
        rules.add(new Rule("Price List"));
        rules.add(new Rule("Fee regulation"));
        rules.add(new Rule("Technical regulations"));
       //rules.add(new Rule("Trading conditions"));
        //rules.add(new Rule("Audit Group"));
        //rules.add(new Rule("Appeals Board Regulations"));
        //rules.add(new Rule("Trader Examination"));
        //rules.add(new Rule("Admission Regulations"));
        //rules.add(new Rule("Election Exchange Council"));
    }

    public List<Rule> getAllRules() {
        return rules;
    }
}
