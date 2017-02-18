package byteinspace.net.eurexcommunicatordb.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel on 18.02.2017.
 */


public final class IndexHolder {

    public static final String DAX = "DAX";
    public static final String MINIDAX = "MINIDAX";
    public static final String SMI = "SMI";
    public static final String SLI = "SLI";
    public static final String OMX = "OMX";
    public static final String STOXX = "STOXX";
    public static final String SENSEX = "SENSEX";


    private static final IndexHolder INSTANCE = new IndexHolder();

    private final Map<String, Index> mapIndex = new HashMap<>();

    private IndexHolder() {


        mapIndex.put(DAX, new Index(DAX, 11435));
        mapIndex.put(MINIDAX, new Index(MINIDAX, 345.4d));
        mapIndex.put(SMI, new Index(SMI, 3445));
        mapIndex.put(SLI, new Index(SLI, 9833));
        mapIndex.put(OMX, new Index(OMX, 2345));
        mapIndex.put(STOXX, new Index(STOXX, 23.44));
        mapIndex.put(SENSEX, new Index(SENSEX, 34543.4));
    }


}
