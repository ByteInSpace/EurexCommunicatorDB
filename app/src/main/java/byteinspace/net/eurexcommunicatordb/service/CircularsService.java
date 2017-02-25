package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.model.Circular;

/**
 * Created by daniel on 25.02.2017.
 */

public class CircularsService {

    public static enum CIRCULAR_TYPE {
        LEGAL, CONNECTIVITY, SYSTEM, RISK;
    }
    private List<Circular> circLegal = new ArrayList<>();
    private List<Circular> circConnectivity = new ArrayList<>();
    private List<Circular> circSystem = new ArrayList<>();
    private List<Circular> circRisk = new ArrayList<>();
    private List<Circular> favorites = new ArrayList<>();

    public CircularsService() {
        Circular cir1 = new Circular();
        cir1.setReleaseDate("24. Feb 2017");
        cir1.setType("Products");
        cir1.setNumber("018/2017");
        cir1.setTitle("Options on Euro-OAT-Futures: Adjustment of the minimum size for Utilization of the Eurex Trade Entry Services (General Conditions for Participation) and new Market-Making rebate and revenue sharing scheme");
        cir1.setUrl("https://www.eurexclearing.com/clearing-en/resources/circulars/Options-on-Euro-OAT-Futures--Adjustment-of-the-minimum-size-for-Utilization-of-the-Eurex-Trade-Entry-Services--General-Conditions-for-Participation--and-new-Market-Making-rebate-and-revenue-sharing-scheme/2925812");
        circLegal.add(cir1);

    }

    public List<Circular> getCircularsLegal() {
        return this.circLegal;
    }


    public List<Circular> getCircularsConnectivity() {
        return this.circConnectivity;
    }

    public List<Circular> getCircularsSystem() {
        return this.circSystem;
    }

    public List<Circular> getCircularsRisk() {
        return this.circRisk;
    }

    public List<Circular> getCircularsFavorites() {
        return this.favorites;
    }

    public void addToFavorites(Circular circ) {
        favorites.add(circ);
    }
    public void removeFromFavorites(Circular circ) {
        favorites.remove(circ);
    }
}
