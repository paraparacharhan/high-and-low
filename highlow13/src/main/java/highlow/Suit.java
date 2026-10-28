package highlow;

public enum Suit {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String label;

    Suit(String label) {
        this.label = label;
    }

    public boolean isStrongerThan(Suit suit) {
        return this.compareTo(suit) > 0;
    }

    public String label() {
        return label;
    }
}
