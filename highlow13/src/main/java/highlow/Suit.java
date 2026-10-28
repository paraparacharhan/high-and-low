package highlow;

public enum Suit {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Suit");

    private final String label;

    public boolean isStrongerThan(Suit suit) {
        return this.compareTo(suit) > 0;
    }

    Suit(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }
}
