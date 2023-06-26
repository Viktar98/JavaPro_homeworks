package homework_2;

public enum DeckType {
    DECK_36(36),
    DECK_52(52);
    private int num;

    DeckType(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
