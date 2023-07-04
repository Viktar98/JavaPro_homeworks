package homework_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game("unknown");
        try {
            game.printInfo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
