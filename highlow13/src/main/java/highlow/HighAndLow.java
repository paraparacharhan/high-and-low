package highlow;

class HighAndLow {
    public int play(Deck deck, Player player) {
        int streak = 0;
        Card currentCard = deck.draw();
        System.out.println("First card: " + currentCard.label());
        Result result;

        do {
            System.out.print("Current card: " + currentCard.label() + ". ");
            Guess playerGuess = player.guess();
            Card nextCard = deck.draw();
            result = playerGuess.judge(currentCard, nextCard);

            if (playerGuess.isHit(currentCard, nextCard)) {
                streak += result.point();
                System.out
                        .println("    Next card: " + nextCard.label() + " ... " + Result.HIT.label() + "! (streak: "
                                + streak + ", " + deck.remaining() + " cards left)");
            } else if (playerGuess.isDraw(currentCard, nextCard)) {
                System.out
                        .println("    Next card: " + nextCard.label() + " ... " + Result.DRAW.label()
                                + " (streak: "
                                + streak + ", " + deck.remaining() + " cards left)");
            } else {
                System.out
                        .println("    Next card: " + nextCard.label() + " ... " + Result.MISS.label()
                                + "... (streak: "
                                + streak + ", " + deck.remaining() + " cards left)");
                System.out.println();
                break;

            }
            System.out.println();

            currentCard = nextCard;

        } while (result.canContinue() && deck.hasCards());

        System.out.println("GameOver. Your streak: " + streak);

        return streak;
    }
}
