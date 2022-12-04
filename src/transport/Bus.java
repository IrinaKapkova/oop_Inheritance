package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, Integer year, String country, String color, int maxSpeed, float fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
    }

    @Override
    public String toString() {
        return "Автобус "+super.toString();
    }

    public void refill() {
        System.out.println("Заправлять бензином или дизелем на заправке");
        fuelPercentage=100.00f;
    }
}
