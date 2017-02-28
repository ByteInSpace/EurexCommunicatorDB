package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by conta on 28.02.2017.
 */

public class MenuItem {

    private String caption;
    private int menuicon;

    public MenuItem(String caption, int menuicon)
    {
        this.caption = caption;
        this.menuicon = menuicon;
    }
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getMenuicon() {
        return menuicon;
    }

    public void setMenuicon(int menuicon) {
        this.menuicon = menuicon;
    }
}
