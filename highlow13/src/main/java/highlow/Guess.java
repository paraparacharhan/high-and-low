package highlow;

import java.util.Optional;

public enum Guess {
    HIGH("h"),
    LOW("l");

    private final String key;

    Guess(String key) {
        this.key = key;
    }

    public Guess judge(Card currentCard, Card nextCard) {
        return nextCard.isStrongerThan(currentCard) ? HIGH : LOW;
    }

    public boolean isHit(Guess guess) {
        return this.equals(guess);
    }

    public static Optional<Guess> fromKey(String input) {
        return input.equals(HIGH.key) ? Optional.of(HIGH) : Optional.of(LOW);
    }
}
