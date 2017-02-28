package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.News;

/**
 * Created by conta on 22.02.2017.
 */

public class NewsService {

    public List<News> news = new ArrayList<>();

    public NewsService() {
        News news1 = new News();
        news1.setDate("03. Februar 2017");
        news1.setHeadline("Marktteilnehmer setzen angesichts geopolitischer Risiken auf Eurex-Zins-Futures");
        news1.setAuthor("Eurex Group");
        news1.setType(News.NEWS_TYPE.Presse);
        news1.setImage(R.drawable.news1);
        news1.setUrl("http://www.eurexchange.com/exchange-de/ueber-uns/news/Marktteilnehmer-setzen-angesichts-geopolitischer-Risiken-auf-Eurex-Zins-Futures/2899980");
        news.add(news1);

        News news2 = new News();
        news2.setDate("26. Januar 2017");
        news2.setHeadline("Eurex Exchange und DEGIRO beschließen Partnerschaft");
        news2.setAuthor("Eurex Exchange");
        news2.setType(News.NEWS_TYPE.Focus);
        news2.setImage(R.drawable.news2);
        news2.setUrl("http://www.eurexchange.com/exchange-de/ueber-uns/news/Eurex-Exchange-und-DEGIRO-beschliessen-Partnerschaft/2889050");
        news.add(news2);

        News news3 = new News();
        news3.setDate("25. Januar 2017");
        news3.setHeadline("Eurex Börsenrat wählt Carola Gräfin von Schmettow zur Vorsitzenden");
        news3.setAuthor("Eurex Exchange");
        news3.setType(News.NEWS_TYPE.Presse);
        news3.setImage(R.drawable.news3);
        news3.setUrl("http://www.eurexchange.com/exchange-de/ueber-uns/news/Eurex-Boersenrat-waehlt-Carola-Graefin-von-Schmettow-zur-Vorsitzenden/2888114");
        news.add(news3);

        News news4 = new News();
        news4.setDate("25. Januar 2017");
        news4.setHeadline("WH SelfInvest: Heimspiel für Trader");
        news4.setAuthor("Eurex Exchange");
        news4.setType(News.NEWS_TYPE.Focus);
        news4.setUrl("http://www.eurexchange.com/exchange-de/ueber-uns/news/wh-selfinvest/2887570");
        news4.setImage(R.drawable.news4);
        news.add(news4);

        News news5 = new News();
        news5.setDate("22. Dezember 2017");
        news5.setHeadline("Deutsche Börse verstärkt Eurex-Produktentwicklung");
        news5.setAuthor("Eurex Exchange");
        news5.setType(News.NEWS_TYPE.Presse);
        news5.setUrl("http://www.eurexchange.com/exchange-de/ueber-uns/news/Deutsche-Boerse-verstaerkt-Eurex-Produktentwicklung/2849266");
        news5.setImage(R.drawable.news5);
        news.add(news5);


    }

    public List<News> getAllNewsOrderedByDate() {
        return news;

    }
}
