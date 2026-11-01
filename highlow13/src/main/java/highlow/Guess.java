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
        if (currentCard instanceof StandardCard currentStandardCard
                && nextCard instanceof StandardCard nextStandardCard) {
            if (nextStandardCard.isStrongerThan(currentStandardCard)) {
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
        } else {
            // どちらかが通常カードでなければ、Jokerが含まれているためDraw
            // standardとjokerしかないことが守られていればOKそう
            // プログラム都合だから良くないかも？？？
            return Result.DRAW;
        }
    }

    public boolean isHit(Card currentCard, Card nextCard) {
        return this.judge(currentCard, nextCard) == Result.HIT;
    }

    public boolean isDraw(Card currentCard, Card nextCard) {
        return this.judge(currentCard, nextCard) == Result.DRAW;
    }

    public static Optional<Guess> fromKey(String input) {
        return Arrays.stream(Guess.values())
                .filter(g -> g.key.equals(input))
                .findFirst();
    }
}
