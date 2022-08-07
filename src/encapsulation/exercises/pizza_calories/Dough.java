package encapsulation.exercises.pizza_calories;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if(!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if(weight < 1 && weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double totatCalories = weight * 2;

        if(flourType.equals("White")) {
            totatCalories = totatCalories * 1.5;
        } else if (flourType.equals("Wholegrain")) {
            totatCalories = totatCalories * 1.0;
        }

        switch (bakingTechnique) {
            case "Crispy" :
                totatCalories = totatCalories * 0.9;
                break;
            case "Chewy" :
                totatCalories = totatCalories * 1.1;
                break;
            case "Homemade" :
                totatCalories = totatCalories * 1.0;
                break;
        }
        return totatCalories;
    }
}
