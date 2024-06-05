package Educational_Initiatives.DesignPatterns.CreationalDesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setDebugEnabled(true);

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.error("This is an error message");
    }
}
