package byteinspace.net.eurexcommunicatordb.adapter;


import android.content.Context;

import byteinspace.net.eurexcommunicatordb.adapter.IndexAdapter;

/**
 * Created by conta on 21.02.2017.
 */

public class FuturesAdapter extends IndexAdapter {

    public static final String FESX = "FESX";
    public static final String FESQ = "FESQ";
    public static final String FXXP = "FXXP";
    public static final String FDAX = "FDAX";
    public static final String FDXM = "FDXM";
    public static final String FSMI = "FSMI";
    public static final String TESX = "TESX";

    public FuturesAdapter(Context context) {
        super(context);
    }

    @Override protected void addIndices() {
        indices.add(getNewIndex(FESX, 11235, 11730));
        indices.add(getNewIndex(FESQ, 311, 380));
        indices.add(getNewIndex(FXXP, 3485, 3440));
        indices.add(getNewIndex(FDAX, 9893, 9850));
        indices.add(getNewIndex(FDXM, 2325, 2341));
        indices.add(getNewIndex(FSMI, 21, 22));
        indices.add(getNewIndex(TESX, 34593, 34503));
    }

}
