package homework_2;

public enum Suit {
    CLUBS('♣'),
    HEARTS('♥'),
    DIAMONDS('♦'),
    SPADES('♠');
    private char userType;
    private boolean trump;

    private Suit(char userType) {
        this.userType = userType;
    }

    public char getUserType() {
        return userType;
    }

    public boolean isTrump() {
        return trump;
    }

    public void setTrump(boolean trump) {
        this.trump = trump;
    }
}
