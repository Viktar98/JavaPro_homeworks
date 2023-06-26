package homework_2;

public class Card {
    private Rank rank;
    private Suit suit;
    private String cardStr;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.cardStr = "‹" + rank.getUserType() + " " + suit.getUserType() + "›";
    }

    public void showCard() {
        System.out.print(cardStr);
    }

    public String getCardStr() {
        return cardStr;
    }
}
