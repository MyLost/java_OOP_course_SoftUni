package interfaces_and_abstraction.ferrari;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputs = scanner.nextLine();

        Ferrari ferrari = new Ferrari(inputs);

        System.out.println(ferrari.toString());
    }
}
