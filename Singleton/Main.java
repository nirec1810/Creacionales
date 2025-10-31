public class Main {
    private static Main instance;

    private Main() {
    }

    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }

    public static void main(String[] args) {
        Main singleton = Main.getInstance();
    }
}