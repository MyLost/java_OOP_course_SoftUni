package interfaces_and_abstraction.car_shop_extend;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsepower, String countryProduced, Double price) {
        super(model, color, horsepower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires\n" +
                "%s sells for %.6f", getModel(), countryProduced(), Car.tires, getModel(), price);
    }
}
