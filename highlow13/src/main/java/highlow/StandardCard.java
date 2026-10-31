package highlow;

public record StandardCard(Rank rank, Suit suit) implements Card {
    public StandardCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public boolean isStrongerThan(StandardCard card) {
        if (this.rank.isSameRank(card.rank())) {
            return this.suit.isStrongerThan(card.suit());
        }
        return this.rank.isStrongerThan(card.rank());
    }

    public String label() {
        return this.rank.label() + " of " + this.suit.label();
    }
}
