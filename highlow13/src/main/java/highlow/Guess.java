package highlow;

import java.util.Arrays;
import java.util.Optional;

public enum Guess {
    HIGH("h"),
    LOW("l");

    private final String key;

    Guess(String key) {
        this.key = key;
    }

    public Result judge(Card currentCard, Card nextCard) {
        if (currentCard.rank() == Rank.JOKER || nextCard.rank() == Rank.JOKER) {
            return Result.DRAW;
        }

        if (nextCard.isStrongerThan(currentCard)) {
            if (this == HIGH) {
                return Result.HIT;
            } else {
                return Result.MISS;
            }
        } else {
            if (this == LOW) {
                return Result.HIT;
            } else {
                return Result.MISS;
            }
        }
    }

    public boolean isHit(Card currentCard, Card nextCard) {
        return this.judge(currentCard, nextCard) == Result.HIT;
    }

    public static Optional<Guess> fromKey(String input) {
        return Arrays.stream(Guess.values())
                .filter(g -> g.key.equals(input))
                .findFirst();
    }
}
