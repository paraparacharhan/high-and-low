package highlow;

import java.util.Scanner;

class HighAndLowApp {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffled();

        Player player = new Player(scanner);

        HighAndLow highAndLow = new HighAndLow();
        highAndLow.play(deck, player);
    }
}