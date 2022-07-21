package abstraction.exercises.problem_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rank rank = Rank.parse(scanner.nextLine());
        Suit suit = Suit.parse(scanner.nextLine());


        System.out.println(String.format("Card name: %s of %s; Card power: %d", rank.name(), suit.name(), rank.getRankValue() + suit.getSuitValue()));

    }
}
