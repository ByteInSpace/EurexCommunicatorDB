package byteinspace.net.eurexcommunicatordb.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conta on 24.02.2017.
 */

public class User {

    private Map<String, Boolean> rights = new HashMap<>();
    private String name;
    private String vorname;
    private String familienname;

    public Boolean isRightSet(String rightstring) {
        Boolean right = rights.get(rightstring);
        if (right != null)
            return right;

        return false;
    }

    public void setRight(String right, boolean value) {
        rights.put(right, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getFamilienname() {
        return familienname;
    }

    public void setFamilienname(String familienname) {
        this.familienname = familienname;
    }
}
