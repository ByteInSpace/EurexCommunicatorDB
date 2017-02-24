package byteinspace.net.eurexcommunicatordb.helper;

import android.content.Context;
import android.graphics.Typeface;
import android.icu.text.DisplayContext;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by conta on 22.02.2017.
 */

public class FontManager {
    public static final String ROOT = "fonts/",
    FONTAWESOME = ROOT  + "fontawesome-webfont.ttf";

    public static Typeface getTypeFace(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets() , font);
    }

    public static void markAsIconContainer(View v, Typeface typeface) {

    }
}
