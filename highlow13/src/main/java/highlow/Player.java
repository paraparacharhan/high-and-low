package highlow;

import java.util.Scanner;

class Player {
    private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    public Guess guess() {
        while (true) {
            System.out.print("Is the next card [h]igh or [s]ame or [l]ow? > ");
            String input = scanner.nextLine();
            if (Guess.fromKey(input).isPresent()) {
                return Guess.fromKey(input).orElseThrow();
            }
            System.err.println("Please enter [h] or [s] or [l]");
        }
    }
}
