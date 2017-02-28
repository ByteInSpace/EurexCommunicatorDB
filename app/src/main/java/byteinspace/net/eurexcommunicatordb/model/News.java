package byteinspace.net.eurexcommunicatordb.model;

/**
 * Created by conta on 22.02.2017.
 */

public class News {

    public static enum NEWS_TYPE {
        Focus, Presse;
    }
    private String Date;
    private String headline;
    private NEWS_TYPE type;
    private String author;
    private int image;
    private String url;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public NEWS_TYPE getType() {
        return type;
    }

    public void setType(NEWS_TYPE type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {

        return Date;
    }


    public void setDate(String date) {
        Date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
