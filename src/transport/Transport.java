package transport;

import java.time.LocalDate;

import static transport.ValidateUtils.validateInteger;
import static transport.ValidateUtils.validateString;

public class Transport {
    private  String  brand;
    private  String model;
    private  final Integer year;
    private  final String country;
    private  String color;
    private  int maxSpeed;

    String attention = "default";

    public Transport(String brand, String model, Integer year, String country, String color, int maxSpeed) {

        setBrand(brand);
        setModel(model);
        this.year = validateInteger(year, 2000);
        this.country = validateString(country, attention);
        setColor(color);
        setMaxSpeed(maxSpeed);
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
        return " " + getBrand() + " модель " + getModel() + ", " + getYear() +
                " года выпуска, сборка в " + getCountry() + ", " + getColor() + " цвета";
    }
}
