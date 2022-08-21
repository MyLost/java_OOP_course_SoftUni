package abstraction.exercises.problem_03;

public enum Rank {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    public int getRankValue() {
        return rankValue;
    }

    private int rankValue;
    Rank(int rank) {
        rankValue = rank;
    }

    public static Rank parse(String str) {
        return Rank.valueOf(str);
    }

}
