package encapsulation.exercises.pizza_calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dought;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
        toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if(name.isEmpty() || name.matches("\\s+") || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDought(Dough dought) {
        this.dought = dought;
    }

    private void setToppings(int toppings) {
        if(toppings < 0 || toppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        return dought.calculateCalories() + toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}
