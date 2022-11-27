package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, Integer year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус "+super.toString();
    }
}
