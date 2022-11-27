package transport;

public class Car extends Transport {
    private float engineVolume;

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public Car(String brand, String model, Integer year, String country, String color, int maxSpeed, float engineVolume) {
        super(brand, model, year, country, color, maxSpeed);
        setEngineVolume(engineVolume);
    }
    @Override
    public String toString () {
        return "Автомобиль " + getBrand() + " " + getModel() + ", " + getYear() +
                " года выпуска, сборка в " + getCountry() + ", " + getColor() + " цвета, объем двигателя: " + getEngineVolume() + " л.";
    }
}