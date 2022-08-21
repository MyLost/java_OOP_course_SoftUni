package abstraction.task_04_hotel_reservation;

public class PriceCalculator {

    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private Discount type;


    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, Discount type) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.type = type;
    }

    public double calculatePrice() {
        return pricePerDay * numberOfDays * season.getMultiplier() * type.getpriceReductionFactor();
    }
}
