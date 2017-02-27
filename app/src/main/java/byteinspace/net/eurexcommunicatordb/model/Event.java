package byteinspace.net.eurexcommunicatordb.model;

import byteinspace.net.eurexcommunicatordb.service.EventService;

/**
 * Created by daniel on 25.02.2017.
 */

public class Event {
    private String datum;
    private String place;
    private String area;
    private String title;
    private int id;

    private EventService.EVENT_AVAILABILITY availability;

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EventService.EVENT_AVAILABILITY getAvailability() {
        return availability;
    }

    public void setAvailability(EventService.EVENT_AVAILABILITY availability) {
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
