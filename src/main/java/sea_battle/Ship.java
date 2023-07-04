package lesson5.sea_battle;

public class Ship {
    private int decks;
    private boolean isVertical;

    public Ship(int decks){
        this.decks = decks;
    }

    public boolean isVertical() {
        return isVertical;
    }

    public void setVertical(boolean vertical) {
        isVertical = vertical;
    }

    public int getDecks() {
        return decks;
    }
}
