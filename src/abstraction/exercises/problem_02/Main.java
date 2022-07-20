package abstraction.exercises.problem_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine() + ":");
        for (CardRank value : CardRank.values()) {
        System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value.name());
    }
}
}
