package highlow;

public enum Suit {
    SPADES("Suit"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private final String label;

    Suit(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }
}