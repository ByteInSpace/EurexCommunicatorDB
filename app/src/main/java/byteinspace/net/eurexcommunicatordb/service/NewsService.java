package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.model.News;

/**
 * Created by conta on 22.02.2017.
 */

public class NewsService {

    public List<News> news = new ArrayList<>();

    public List<News> getAllNewsOrderedByDate() {
        News news1 = new News();
        news1.setDate("03. Februar 2017");
        news1.setHeadline("Marktteilnehmer setzen angesichts geopolitischer Risiken auf Eurex-Zins-Futures");
        news1.setAuthor("Eurex Group");
        news1.setType(News.NEWS_TYPE.Presse);
        news.add(news1);

        News news2 = new News();
        news2.setDate("26. Januar 2017");
        news2.setHeadline("Eurex Exchange und DEGIRO beschließen Partnerschaft");
        news2.setAuthor("Eurex Exchange");
        news2.setType(News.NEWS_TYPE.Focus);
        news.add(news2);

        News news3 = new News();
        news3.setDate("25. Januar 2017");
        news3.setHeadline("Eurex Börsenrat wählt Carola Gräfin von Schmettow zur Vorsitzenden");
        news3.setAuthor("Eurex Exchange");
        news3.setType(News.NEWS_TYPE.Presse);
        news.add(news3);

        News news4 = new News();
        news4.setDate("25. Januar 2017");
        news4.setHeadline("WH SelfInvest: Heimspiel für Trader");
        news4.setAuthor("Eurex Exchange");
        news4.setType(News.NEWS_TYPE.Focus);

        return news;
    }
}
