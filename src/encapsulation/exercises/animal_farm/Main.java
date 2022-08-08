package encapsulation.exercises.animal_farm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chickenName = scanner.nextLine();
        int chickenAge = Integer.parseInt(scanner.nextLine());

        try {
            Chicken chicken = new Chicken(chickenName, chickenAge);
            System.out.println(chicken);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
