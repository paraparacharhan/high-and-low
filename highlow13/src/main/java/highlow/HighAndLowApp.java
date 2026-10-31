package highlow;

import java.util.Scanner;

class HighAndLowApp {
    public static void main(String[] args) {
        int gameRound = 1;
        if (args.length > 0) {
            try {
                gameRound = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Non-numeric input was detected, so the number of game rounds is set to 1.");
            }
        }

        Scanner scanner = new Scanner(System.in);

        Player player = new Player(scanner);

        HighAndLow highAndLow = new HighAndLow();
        Deck deck = new Deck();
        int maxRecord = 0;
        int currentRecord = 0;
        for (int i = 1; i <= gameRound; i++) {
            System.out.println("Round " + i + " start!");
            deck.setup();
            currentRecord = highAndLow.play(deck, player);
            maxRecord = Math.max(maxRecord, currentRecord);
            System.out.println();
        }

        System.out.println("The max record is " + maxRecord + " consecutive hits.");
    }
}
