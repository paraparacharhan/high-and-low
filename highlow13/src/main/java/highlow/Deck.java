package highlow;

import java.util.Collections;
import java.util.LinkedList;

class Deck {
    private LinkedList<Card> deck = new LinkedList<>();

    public void shuffled() {
        deck.clear();
        for (Rank r : Rank.values()) {
            if (r == Rank.JOKER) {
                continue;
            }
            for (Suit s : Suit.values()) {
                deck.add(new Card(r, s));
            }
        }
        deck.add(new Card(Rank.JOKER, Suit.HEARTS));
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
