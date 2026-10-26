package highlow;

public record Card(Rank rank, Suit suit) {
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public boolean isStrongerThan(Card card) {
        return this.rank.isStrongerThan(card.rank);
    }

    public boolean isSameStrength(Card card) {
        return this.rank.compareTo(card.rank) == 0 || this.rank == Rank.JOKER || card.rank == Rank.JOKER;
    }

    public String label() {
        // String rankLabel = this.rank.name();
        // String suitLabel = this.rank.name();
        return this.rank.label() + " of " + this.suit.label();
    }
}
