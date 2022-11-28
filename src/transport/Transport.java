package transport;

import java.time.LocalDate;

import static transport.ValidateUtils.*;

public abstract class Transport {
    private  String  brand;
    private  String model;
    private  final Integer year;
    private  final String country;
    private  String color;
    private  int maxSpeed;

    protected float fuelPercentage;

    String attention = "default";

    public Transport(String brand, String model, Integer year, String country, String color, int maxSpeed, float fuelPercentage) {

        setBrand(brand);
        setModel(model);
        this.year = validateInteger(year, 2000);
        this.country = validateString(country, attention);
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelPercentage(fuelPercentage);
    }

    public float getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(float fuelPercentage) {
        this.fuelPercentage = validateFloat2(fuelPercentage);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = validateString (brand, attention);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = validateString(model, attention);
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = validateString(color, attention);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.abs(maxSpeed);
    }
    public int getAge(){
        return LocalDate.now().getYear()-year;
    }
    public String toString () {
        return String.format(" %s модель %s  %4d года выпуска, сборка в %s  %s цвета. Количество топлива %,3.2f процентов\n", getBrand(), getModel(), getYear(),getCountry(),getColor(), fuelPercentage);
    }
    public static float validateFloat2 (float value) {
        return value<=100.00f &&value>=0.00f? value: 0.00f;
    }
    public abstract void refill();

}
