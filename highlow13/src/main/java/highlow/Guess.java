package highlow;

import java.util.Optional;

public enum Guess {
    HIGH("h"),
    LOW("l");

    private final String key;

    Guess(String key) {
        this.key = key;
    }

    public boolean judge(Card currentCard, Card nextCard) {
        return currentCard.isStrongerThan(nextCard);
    }

    public boolean isHit(Guess guess) {
        return this.equals(guess);
    }

    public static Optional<Guess> fromKey(String input) {
        return input.equals(HIGH.key) ? Optional.of(HIGH) : Optional.of(LOW);
    }
}
