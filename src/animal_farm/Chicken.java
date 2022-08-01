package animal_farm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if(name.length() > 1 && name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty.");
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private void setAge(int age) {
        if(age >= 0 && age <= 15) {
            this.age = age;
        } else {
            System.out.println("Age should be between 0 and 15.");
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    public double producePerDay() {
       return calculateProductPerDay();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", getName(), getAge(), producePerDay());
    }

    private double calculateProductPerDay() {
        if(age < 6) {
            return 2;
        } else if (age < 12) {
            return 1;
        } else {
            return 0.75;
        }
    }
}
