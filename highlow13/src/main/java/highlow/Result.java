package highlow;

public enum Result {
    HIT,
    DRAW,
    MISS;

    public int point() {
        return 1;
    }

    // public boolean canContinue(Guess guess) {
    // return guess.isHit(guess)
    // }
}