package Educational_Initiatives.DesignPatterns.CreationalDesignPattern.Singleton;

public class Logger {
    private static Logger instance;
    private static boolean isDebugEnabled = false;

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setDebugEnabled(boolean enabled) {
        isDebugEnabled = enabled;
    }

    public void debug(String message) {
        if (isDebugEnabled) {
            System.out.println("[DEBUG] " + message);
        }
    }

    public void info(String message) {
        System.out.println("[INFO] " + message);
    }

    public void error(String message) {
        System.err.println("[ERROR] " + message);
    }
}