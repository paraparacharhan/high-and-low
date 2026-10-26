package highlow;

import java.nio.ReadOnlyBufferException;
import java.util.Scanner;

class HighAndLow {
    public void play(Deck deck, Player player) {
        Card currentCard = deck.draw();
        System.out.println("First card: " + currentCard.label());
        int gameCount = 0;
        while (true) {
            System.out.print("Current card: " + currentCard.label() + ". ");
            Guess playerGuess = player.guess();
            Card nextCard = deck.draw();
            Guess rank = playerGuess.judge(currentCard, nextCard);
            if (playerGuess.isHit(rank)) {
                gameCount += Result.HIT.point();
                System.out.println("    Next card: " + nextCard.label() + " ... " + Result.HIT + "! (streak: "
                        + gameCount + ", " + deck.remaining() + "cards left)");
            } else {
                System.out.println("    Next card: " + nextCard.label() + " ... " + Result.MISS + "... (streak: "
                        + gameCount + ", " + deck.remaining() + "cards left)");
                break;
            }

            if (Result.HIT.canContinue(deck)) {
                break;
            } else {
                currentCard = nextCard;
            }

        }
        System.out.println("GameOver. Your streak:" + gameCount);

    }
}