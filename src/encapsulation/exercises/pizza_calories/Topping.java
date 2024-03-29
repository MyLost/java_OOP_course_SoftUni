package encapsulation.exercises.pizza_calories;

public class Topping {
    private String toppingType;

    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if(!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")){
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if(weight < 1 && weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        switch (toppingType) {
            case "Meat" :
                return weight * 2 * 1.2;
            case "Veggies" :
                return weight * 2 * 0.8;
            case "Cheese" :
                return weight * 2 * 1.1;
            case "Sauce" :
                return weight * 2 * 0.9;
        }

        return 0;
    }
}
