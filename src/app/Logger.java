package app;

import java.util.ArrayList;
import java.util.List;

//клас Singleton
public class Logger {
    private static Logger instance;

    private List<String> logs;

    private Logger() {
        logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    //Метод для запису повідомлення логування
    public void log(String message) {
        logs.add(message);
    }

    // Метод для отримання всіх логів
    public List<String> getLogs() {
        return logs;
    }
}
