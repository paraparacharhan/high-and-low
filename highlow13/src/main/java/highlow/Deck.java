package highlow;

import java.util.Collections;
import java.util.LinkedList;

class Deck {
    private LinkedList<Card> deck = new LinkedList<>();

    public void setup() {
        deck.clear();
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                deck.add(new StandardCard(r, s));
            }
        }
        deck.add(new JokerCard());
        Collections.shuffle(deck);
    }

    public Card draw() {
        return deck.pop();
    }

    public boolean hasCards() {
        return !deck.isEmpty();
    }

    public int remaining() {
        return deck.size();
    }
}
