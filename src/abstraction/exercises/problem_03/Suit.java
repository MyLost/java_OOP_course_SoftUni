package abstraction.exercises.problem_03;

public enum Suit {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    public int getSuitValue() {
        return suitValue;
    }

    private int suitValue;
    Suit(int suit) {
        suitValue = suit;
    }

    public static Suit parse(String str) {
        return Suit.valueOf(str);
    }
}
