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

    public boolean canContinue() {
        return this == HIT || this == DRAW;
    }

    public String label() {
        return label;
    }
}
