package highlow;

import java.util.Collections;
import java.util.LinkedList;

class Deck {
    private LinkedList<Card> deck = new LinkedList<>();

    public void shuffled() {
        // LinkedList<Card> deck = new LinkedList<>();
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                deck.add(new Card(r, s));
            }
        }

        Collections.shuffle(deck);
    }

    public Card draw() {
        return deck.pop();
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public int remaining() {
        return deck.size();
    }
}
