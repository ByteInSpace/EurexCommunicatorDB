package byteinspace.net.eurexcommunicatordb.adapter;


import android.content.Context;

import byteinspace.net.eurexcommunicatordb.adapter.IndexAdapter;

/**
 * Created by conta on 21.02.2017.
 */

public class OptionsAdapter extends IndexAdapter {

    public static final String OESX = "OESX";
    public static final String OESQ = "OESQ";
    public static final String OXXP = "OXXP";
    public static final String ODAX = "ODAX";
    public static final String ODXM = "ODXM";
    public static final String OSMI = "OSMI";
    public static final String OEEX = "OEEX";

    public OptionsAdapter(Context context) {
        super(context);
    }

    @Override protected void addIndices() {
        indices.add(getNewIndex(OESX, 11435, 11438));
        indices.add(getNewIndex(OESQ, 345, 330));
        indices.add(getNewIndex(OXXP, 3445, 3449));
        indices.add(getNewIndex(ODAX, 9833, 9820));
        indices.add(getNewIndex(ODXM, 2345, 2348));
        indices.add(getNewIndex(OSMI, 23, 24));
        indices.add(getNewIndex(OEEX, 34543, 34603));
    }

}
