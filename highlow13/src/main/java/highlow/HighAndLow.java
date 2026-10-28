package highlow;

class HighAndLow {
    public int play(Deck deck, Player player) {
        Card currentCard = deck.draw();
        System.out.println("First card: " + currentCard.label());
        int streak = 0;
        while (true) {
            System.out.print("Current card: " + currentCard.label() + ". ");
            Guess playerGuess = player.guess();
            Card nextCard = deck.draw();
            // ここまではあってそう
            // Result rank = playerGuess.judge(currentCard, nextCard);
            // same判定かdraw判定を新たに作るか、drawを無くす
            Result result = playerGuess.judge(currentCard, nextCard);
            if (playerGuess.isHit(currentCard, nextCard)) {
                streak += result.point();
                System.out
                        .println("    Next card: " + nextCard.label() + " ... " + Result.HIT.label() + "! (streak: "
                                + streak + ", " + deck.remaining() + "cards left)");
            } else {
                if (result == Result.DRAW) {
                    System.out
                            .println("    Next card: " + nextCard.label() + " ... " + Result.DRAW.label()
                                    + " (streak: "
                                    + streak + ", " + deck.remaining() + "cards left)");
                } else {
                    System.out
                            .println("    Next card: " + nextCard.label() + " ... " + Result.MISS.label()
                                    + "... (streak: "
                                    + streak + ", " + deck.remaining() + "cards left)");
                    System.out.println();
                    break;
                }
            }

            if (result.canContinue(deck)) {
                break;
            } else {
                currentCard = nextCard;
            }

        }
        System.out.println("GameOver. Your streak: " + streak);

        return streak;
    }
}
