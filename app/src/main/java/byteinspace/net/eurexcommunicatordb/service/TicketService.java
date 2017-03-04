package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.model.Ticket;

/**
 * Created by daniel on 04.03.2017.
 */

public class TicketService {

    private List<Ticket> tickets = new ArrayList<>();

    protected TicketService() {
        Ticket ticket1 = new Ticket();
        ticket1.setTicketID("6477");
        ticket1.setTitle("Disrupted line");
        ticket1.setCreatedOn("09. Mar 2017");
        ticket1.setFinished(true);
        tickets.add(ticket1);

        Ticket ticket2 = new Ticket();
        ticket2.setTicketID("6435");
        ticket2.setTitle("Wrong field in ETI");
        ticket2.setCreatedOn("07. Mar 2017");
        tickets.add(ticket2);

        Ticket ticket3 = new Ticket();
        ticket3.setTicketID("23455");
        ticket3.setTitle("Wrong Qty on order");
        ticket3.setCreatedOn("06. Mar 2017");
        ticket3.setFinished(true);
        tickets.add(ticket3);

        Ticket ticket4 = new Ticket();
        ticket4.setTicketID("6474");
        ticket4.setTitle("Disrupted line");
        ticket4.setCreatedOn("04. Mar 2017");
        tickets.add(ticket4);

        Ticket ticket5 = new Ticket();
        ticket5.setTicketID("6472");
        ticket5.setTitle("Disrupted line");
        ticket5.setCreatedOn("03. Mar 2017");
        ticket5.setFinished(true);
        tickets.add(ticket5);
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }
}
