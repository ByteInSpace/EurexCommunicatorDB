package byteinspace.net.eurexcommunicatordb.service;

/**
 * Created by conta on 22.02.2017.
 */

public class ServiceFactory {

    private static NewsService newsService;
    private static AuthenticationService authenticationService;
    private static MailingService mailingService;
    private static EventService eventService;
    private static ChartService indexService;
    private static SurveyService surveyService;
    private static InvoiceService invoiceService;
    private static ReportService reportService;
    private static NotificationService notificationService;
    private static TradingOverviewService tradingOverviewService;
    private static PressService pressService;
    private static FormsService formsService;
    private static TicketService ticketService;

    private static ServiceFactory factory;

    private ServiceFactory() {

        newsService = new NewsService();
        authenticationService = new AuthenticationService();
        mailingService = new MailingService();
        eventService = new EventService();
        indexService = new ChartService();
        surveyService = new SurveyService();
        invoiceService = new InvoiceService();
        reportService = new ReportService();
        notificationService = new NotificationService();
        tradingOverviewService = new TradingOverviewService();
        pressService = new PressService();
        formsService = new FormsService();
        ticketService = new TicketService();

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

    public static AuthenticationService getAuthenticationService() { return authenticationService;}

    public static MailingService getMailingService() { return mailingService;}

    public static EventService getEventService() { return eventService; }

    public static ChartService getFuturesService() { return indexService; }

    public static SurveyService getSurveyService() { return surveyService; }

    public static InvoiceService getInvoiceService() { return invoiceService; }

    public static ReportService getReportService() { return reportService; }

    public static NotificationService getNotificationService() { return notificationService; }

    public static TradingOverviewService getTradingOverviewService() { return tradingOverviewService; }

    public static PressService getPressService() { return pressService; }

    public static FormsService getFormsService() { return formsService; }

    public static TicketService getTicketService() { return ticketService; }
}
