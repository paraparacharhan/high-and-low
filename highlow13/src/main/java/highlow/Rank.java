package highlow;

public enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private final String label;

    Rank(String label) {
        this.label = label;
    }

    public boolean isStrongerThan(Rank rank) {
        return this.compareTo(rank) > 0;
        // 位置ではなく順序関係を知りたいため、compareTO()を使用
        // return this.ordinal() > rank.ordinal();
    }

    public boolean isSameRank(Rank rank) {
        return this.compareTo(rank) == 0;
    }

    public String label() {
        return label;
    }
}
