package highlow;

public enum Result {
    HIT("Hit"),
    DRAW("Draw"),
    MISS("Miss");

    private final String label;

    Result(String label) {
        this.label = label;
    }

    public int point() {
        return 1;
    }

    public boolean canContinue(Deck deck) {
        return deck.isEmpty();
    }

    public String label() {
        return label;
    }
}
