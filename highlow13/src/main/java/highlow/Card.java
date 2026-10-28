package highlow;

public record Card(Rank rank, Suit suit) {
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public boolean isStrongerThan(Card card) {
        if (this.rank.isSameRank(card.rank())) {
            return this.suit.isStrongerThan(card.suit());
        }
        return this.rank.isStrongerThan(card.rank());
    }

    public String label() {
        return this.rank.label() + " of " + this.suit.label();
    }
}
