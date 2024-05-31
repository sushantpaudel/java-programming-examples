// •	Implement a singleton class "Logger" that maintains a log of messages. Demonstrate how multiple accesses to the logger return the same instance.
// Singleton Design Pattern

class Logger {
    private static Logger instance;

    private Logger() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

public class SingletonDesignPattern {

}