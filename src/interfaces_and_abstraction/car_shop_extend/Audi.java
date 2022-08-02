package interfaces_and_abstraction.car_shop_extend;

public class Audi extends CarImpl implements Rentable {

    private Integer rentDays;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsepower, String countryProduced, Integer rentDays, Double pricePerDay) {
        super(model, color, horsepower, countryProduced);
        this.rentDays = rentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return rentDays;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires\n" +
                "Minimum rental period of %d days. Price per day %.6f", getModel(), countryProduced(), Car.tires, rentDays, pricePerDay);
    }
}
