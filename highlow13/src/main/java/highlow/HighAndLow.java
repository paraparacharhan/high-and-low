package highlow;

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
                System.out
                        .println("    Next card: " + nextCard.label() + " ... " + Result.HIT.label() + "! (streak: "
                                + gameCount + ", " + deck.remaining() + "cards left)");
            } else {
                System.out
                        .println("    Next card: " + nextCard.label() + " ... " + Result.MISS.label() + "... (streak: "
                                + gameCount + ", " + deck.remaining() + "cards left)");
                System.out.println();
                break;
            }

            if (Result.HIT.canContinue(deck)) {
                break;
            } else {
                currentCard = nextCard;
            }

        }
        System.out.println("GameOver. Your streak: " + gameCount);

    }
}