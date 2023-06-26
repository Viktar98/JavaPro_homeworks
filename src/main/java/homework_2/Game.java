package homework_2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String gameId;
    private Card[] deck;
    private DeckType deckType;
    private Player[] players;
    private int numbersOfPlayers, numberOfCardForPlayer;

    public Game(String gameId) {
        this.gameId = gameId;
        setGameParameters();
        this.deck = createNewDeck();
        handDeck();
        distributionCardsForPlayers();
    }

    public void setGameParameters() {
        int tmp;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ВЫБЕРИТЕ КОЛОДУ:");
            System.out.println(" 1) 36 карт");
            System.out.println(" 2) 52 карты");
            System.out.println(" 3) выход");
            System.out.print("ВВОД: ");
            tmp = sc.nextInt();
            if (tmp >= 0 && tmp <= 2)
                break;
            System.out.println("НЕКОРРЕКТНЫЙ ВВОД!\nПОВТОРИТЕ ПОПЫТКУ.");
        }
        if (tmp == 0) {
            System.out.println("ВСЕГО ДОБРОГО, ДОСВИДАНИЯ!");
            return;
        } else if (tmp == 1)
            this.deckType = DeckType.DECK_36;
        else
            this.deckType = DeckType.DECK_52;
        tmp = 0;
        int maxPlayers = this.deckType == DeckType.DECK_36 ? 36 : 52;
        while (true) {
            System.out.print("ВВЕДИТЕ КОЛИЧЕСТВО ИГРОКОВ: ");
            tmp = sc.nextInt();
            if (tmp >= 1 && tmp <= maxPlayers)
                break;
            if (tmp == 0)
                System.out.println("БЕЗ УЧАСТНИКОВ ИГРА НЕ СОСТОИТЬСЯ!\nПОВТОРИТЕ ВВОД.");
            if (tmp < 0)
                System.out.println("НЕКОРРЕТНЫЙ ВВОД!\nПОВТОРИТЕ ПОПЫТКУ.");
            else
                System.out.println("ПРИ ТАКОМ КОЛИЧЕСТВЕ, КАРТ ДЛЯ ВСЕХ ИГОРОКОВ НЕ ХВАТИТ!\nПОВТОРИТЕ ПОПЫТКУ.");
        }
        this.numbersOfPlayers = tmp;
        tmp = 0;
        while (true) {
            System.out.print("СКОЛЬКО КАРТ ВЫДАЁТСЯ " + (numbersOfPlayers == 1 ? "ИГРОКУ: " : "ИГРОКАМ: "));
            tmp = sc.nextInt();
            if (tmp >= 1 && tmp * numbersOfPlayers <= deckType.getNum())
                break;
            if (tmp == 0)
                System.out.println("БЕЗ КАРТ ИГРА НЕ СОСТОИТЬСЯ!\nПОВТОРИТЕ ВВОД.");
            else if (tmp * numbersOfPlayers > deckType.getNum())
                System.out.println("В КОЛОДЕ НЕТ ТАКОГО КОЛИЧЕСТВА КАРТ!\nПОВТОРИТЕ ВВОД");
            else
                System.out.println("ВВОД НЕКОРРЕКТНЫЙ!\nПОВТОРИТЕ ПОПЫТКУ.");
        }
        this.numberOfCardForPlayer = tmp;
        String nm;
        this.players = new Player[numbersOfPlayers];
        for (int i = 0; i < players.length; i++) {
            System.out.print("ВВЕДИТЕ ИМЯ ИГРОКА " + (int) (i + 1) + " : ");
            nm = sc.next();
            players[i] = new Player(nm);
        }
        sc.close();
    }

    public Card[] createNewDeck() {
        Card[] cards = new Card[deckType.getNum()];
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        int count = 0;
        int fi = deckType.getNum() == 36 ? 4 : 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = ranks.length - 1; j >= fi; j--) {
                cards[count] = new Card(ranks[j], suits[i]);
                count++;
            }
        }
        return cards;
    }

    public void handDeck() {
        Random r = new Random();
        Card tmpCard = new Card(Rank.NINE, Suit.HEARTS);
        int tmpInt;
        for (int j = 0; j < deck.length; j++) {
            for (int i = 0; i < deck.length; i++) {
                do {
                    tmpInt = r.nextInt(deck.length);
                } while (i == tmpInt);
                tmpCard = deck[i];
                deck[i] = deck[tmpInt];
                deck[tmpInt] = tmpCard;
            }
        }
    }

    public Card takeCardFromDeck() {
        Card card = deck[0];
        deck[0] = null;
        for (int i = 0; i < deck.length - 1; i++) {
            deck[i] = deck[i + 1];
        }
        deck[deck.length-1] = null;
        return card;
    }

    public Card[] takeCardsFromDeck(int num) {
        Card[] cards = new Card[num];
        for (int i = 0; i < num; i++) {
            cards[i] = takeCardFromDeck();
        }
        return cards;
    }

    public void distributionCardsForPlayers() {
        for (int i = 0; i < numbersOfPlayers; i++) {
            Card[] cards0 = new Card[deckType.getNum()];
            Card[] cardsNew = takeCardsFromDeck(numberOfCardForPlayer);
            for (int j = 0; j < numberOfCardForPlayer; j++) {
                cards0[j] = cardsNew[j];
            }
            players[i].setCards(cards0);
        }
    }

    public void printInfo() {
        System.out.println("\nКоличество игроков: " + numbersOfPlayers);
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nИгрок " + players[i].getName() + ", количество карт - " + numberOfCardForPlayer);
            for (int j = 0; j < players[i].getCards().length; j++) {
                if (players[i].getCards()[j] != null)
                    System.out.print(players[i].getCards()[j].getCardStr() + " ");
                else break;
            }
        }
        System.out.println("\nКоличество карт в колоде: " + (deckType.getNum() - numbersOfPlayers * numberOfCardForPlayer));
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] != null)
                System.out.print(deck[i].getCardStr() + " ");
            else break;
        }
    }
}

