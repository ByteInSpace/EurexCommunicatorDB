package byteinspace.net.eurexcommunicatordb.service;

/**
 * Created by conta on 22.02.2017.
 */

public class ServiceFactory {

    private static NewsService newsService;

    private static ServiceFactory factory;

    private ServiceFactory() {
        newsService = new NewsService();
    }

    public static ServiceFactory getFactory() {

        if (factory == null) {
            factory = new ServiceFactory();
        }
        return factory;

    }

    public static NewsService getNewsService() {
        return newsService;
    }

}
