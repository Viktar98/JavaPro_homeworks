package homework_2;

public class Player {
    private String name;
    private int numbersOfCards;
    private Card[] cards;

    public Player(String name) {
        this.name = name;
    }

    public int getNumbersOfCards() {
        return numbersOfCards;
    }

    public Card[] getCards() {
        return cards;
    }
    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    public String getName() {
        return name;
    }
}
