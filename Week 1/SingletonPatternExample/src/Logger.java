public class Logger {
    private static Logger instance;
    private Logger() {
        System.out.println("Logger instance created");
    }
    public static Logger getInstance()
    {
        return instance;
    }
}
