package highlow;

public record JokerCard() implements Card {
    public String label() {
        return "Joker";
    }
}