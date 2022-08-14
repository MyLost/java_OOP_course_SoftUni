package encapsulation.exercises.pizza_calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Pizza pizza = null;

        while (!"END".equals(command)) {
            String[] inputTokens = command.split("\\s+");
            if (inputTokens[0].equals("Pizza")) {
                try {
                    pizza = new Pizza(inputTokens[1], Integer.parseInt(inputTokens[2]));
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                    break;
                }
            } else if (inputTokens[0].equals("Dough")) {
                try {
                    Dough dough = new Dough(inputTokens[1], inputTokens[2], Double.parseDouble(inputTokens[3]));
                    pizza.setDought(dough);
                } catch (IllegalArgumentException ex) {
                    pizza = null;
                    System.out.println(ex.getMessage());
                    break;
                }
            } else {
                try {
                    Topping topping = new Topping(inputTokens[1], Double.parseDouble(inputTokens[2]));
                    pizza.addTopping(topping);
                } catch (IllegalArgumentException ex) {
                    pizza = null;
                    System.out.println(ex.getMessage());
                    break;
                }
            }

            command = scanner.nextLine();
        }

        if(pizza != null) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getOverallCalories()));
        }
    }
}
