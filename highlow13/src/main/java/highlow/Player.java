package highlow;

import java.util.Scanner;

class Player {
    private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    public Guess guess() {
        while (true) {
            System.out.print("h & l > ");
            String input = scanner.nextLine();
            if (Guess.fromKey(input).isPresent()) {
                return Guess.fromKey(input).orElseThrow();
            }
            System.out.println("h or l");
        }
    }
}