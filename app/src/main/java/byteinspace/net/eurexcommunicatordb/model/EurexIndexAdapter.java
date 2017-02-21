package byteinspace.net.eurexcommunicatordb.model;

import android.content.Context;

import byteinspace.net.eurexcommunicatordb.adapter.IndexAdapter;

/**
 * Created by conta on 21.02.2017.
 */

public class EurexIndexAdapter extends IndexAdapter {

    public static final String DAX = "DAX";
    public static final String MINIDAX = "MINIDAX";
    public static final String SMI = "SMI";
    public static final String SLI = "SLI";
    public static final String OMX = "OMX";
    public static final String STOXX = "STOXX";
    public static final String SENSEX = "SENSEX";

    public EurexIndexAdapter(Context context) {
        super(context);
    }

    @Override protected void addIndices() {
        indices.add(getNewIndex(DAX, 11435, 11430));
        indices.add(getNewIndex(MINIDAX, 345, 380));
        indices.add(getNewIndex(SMI, 3445, 3440));
        indices.add(getNewIndex(SLI, 9833, 9850));
        indices.add(getNewIndex(OMX, 2345, 2341));
        indices.add(getNewIndex(STOXX, 23, 22));
        indices.add(getNewIndex(SENSEX, 34543, 34503));
    }
}
