package app;

public class Main {
    public static void main(String[] args) {
        // Отримуємо екземпляр Logger через getInstance()
        Logger logger1 = Logger.getInstance();
        logger1.log("Це перше повідомлення логування");

        // Отримуємо той же екземпляр Logger через getInstance()
        Logger logger2 = Logger.getInstance();
        logger2.log("Це друге повідомлення логування");

        if (logger1.equals(logger2)) {
            System.out.println("Обидва екземпляри є одним і тим же об'єктом.");
        } else {
            System.out.println("Екземпляри різні!");
        }

        for(String log : Logger.getInstance().getLogs()){
            System.out.println(log);
        }
    }
}
