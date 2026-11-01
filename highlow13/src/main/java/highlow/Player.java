package highlow;

import java.util.Optional;
import java.util.Scanner;

class Player {
    private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    public Guess guess() {
        while (true) {
            System.out.print("Is the next card [h]igh or [l]ow? > ");
            String input = scanner.nextLine();
            Optional<Guess> guess = Guess.fromKey(input);
            if (guess.isPresent()) {
                return guess.orElseThrow();
            }
            System.err.println("Please enter [h] or [l]");
        }
    }
}
