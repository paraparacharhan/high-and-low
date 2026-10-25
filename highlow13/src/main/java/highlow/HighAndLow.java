package highlow;

import java.nio.ReadOnlyBufferException;
import java.util.Scanner;

class HighAndLow {
    public void play(Deck deck, Player player) {
        Card currentCard = deck.draw();
        int gameCount = 0;
        while (true) {
            System.out.println(deck.draw().label());
            Guess playerGuess = player.guess();
            Card nextCard = deck.draw();
            Guess rank = playerGuess.judge(currentCard, nextCard);
            if (playerGuess.isHit(rank)) {
                gameCount += Result.HIT.point();
            } else {
                break;
            }

            if (!Result.HIT.canContinue(deck)) {
                break;
            } else {
                currentCard = nextCard;
            }

        }
        System.out.println("GameOver. Your streak:" + gameCount);

    }
}