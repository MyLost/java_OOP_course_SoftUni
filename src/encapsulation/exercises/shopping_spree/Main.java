package encapsulation.exercises.shopping_spree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new HashMap<>();
        Map<String, Product> products = new HashMap<>();

        String[] peopleInput = scanner.nextLine().split(";");

        for (String personData: peopleInput) {
            String[] personTokens = personData.split("=");
            try {
                Person person = new Person(personTokens[0], Double.parseDouble(personTokens[1]));
                people.put(personTokens[0], person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        String[] productInput = scanner.nextLine().split(";");

        for (String productData: productInput) {
            String[] productTokens = productData.split("=");
            try {
                Product product = new Product(productTokens[0], Double.parseDouble(productTokens[1]));
                products.put(productTokens[0], product);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }


        String command = scanner.nextLine();

        while(!"END".equals(command)) {
            String[] commandInput = command.split("\\s+");

            String personName = commandInput[0];
            String productName = commandInput[1];

            try {
                people.get(personName).buyProduct(products.get(productName));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            command = scanner.nextLine();
        }

        people.entrySet().forEach(person -> {
            System.out.println(String.format
                    ("%s - %s", person.getValue().getName(),
                            person.getValue().getProduct().isEmpty() ? "Nothing bought" :
                            person.getValue().getProduct().stream().map(product -> product.getName()).collect(Collectors.joining(", "))));
        });
    }
}
