package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import byteinspace.net.eurexcommunicatordb.model.Event;

/**
 * Created by daniel on 25.02.2017.
 */

public class EventService {

    public enum EVENT_AVAILABILITY {
        AVAILABLE, REGISTERED, FULL
    }

    private Map<Integer, Event> events = new HashMap<>();

    public EventService() {
        Event event1 = new Event();
        event1.setDatum("02.03.2017");
        event1.setArea("Global Fixed Income");
        event1.setPlace("Madrid");
        event1.setTitle("Annual Investment Roundtable");
        event1.setAvailability(EVENT_AVAILABILITY.AVAILABLE);
        event1.setId(1);
        events.put(event1.getId(), event1);

        Event event2 = new Event();
        event2.setDatum("07.03.2017");
        event2.setArea("Talentum");
        event2.setPlace("Stockholm");
        event2.setTitle("Nordic Post Trade");
        event2.setAvailability(EVENT_AVAILABILITY.REGISTERED);
        event2.setId(2);
        events.put(event2.getId(), event2);

        Event event3 = new Event();
        event3.setDatum("014.03.2017");
        event3.setArea("FIA");
        event3.setPlace("Boca Raton");
        event3.setTitle("FIA Boca 2017");
        event3.setAvailability(EVENT_AVAILABILITY.FULL);
        event3.setId(3);
        events.put(event3.getId(), event3);

        Event event4 = new Event();
        event4.setDatum("04.05.2017");
        event4.setArea("FOW");
        event4.setPlace("Amsterdam");
        event4.setTitle("FOW Amsterdam");
        event4.setAvailability(EVENT_AVAILABILITY.AVAILABLE);
        event4.setId(4);
        events.put(event4.getId(), event4);

        Event event5 = new Event();
        event5.setDatum("19.04.2017");
        event5.setArea("WFE");
        event5.setPlace("Frankfurt");
        event5.setTitle("IOMA: World Federation of Exchanges Clearing and Derivatives Conference");
        event5.setAvailability(EVENT_AVAILABILITY.AVAILABLE);
        event5.setId(5);
        events.put(event5.getId(), event5);

        Event event6 = new Event();
        event6.setDatum("11.05.2017");
        event6.setArea("FOW");
        event6.setPlace("Dublin");
        event6.setTitle("World Congress 2017");
        event6.setAvailability(EVENT_AVAILABILITY.AVAILABLE);
        event6.setId(6);
        events.put(event6.getId(), event6);

        Event event7 = new Event();
        event7.setDatum("16.05.2017");
        event7.setArea("WBR");
        event7.setPlace("Boston");
        event7.setTitle("Fixed Income Leader Summit");
        event7.setAvailability(EVENT_AVAILABILITY.AVAILABLE);
        event7.setId(7);
        events.put(event7.getId(), event7);
    }

    public List<Event> getAllEvents() {
        List<Event> eventsList = new ArrayList<>();
        for (Event event : this.events.values()) {
            eventsList.add(event);
        }
        return eventsList;
    }

    public Event getEventByID(int id) {
        return this.events.get(id);
    }
}
