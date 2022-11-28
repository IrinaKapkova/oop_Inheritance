package transport;

import static transport.ValidateUtils.*;

public class Train extends Transport{
    private float tripPrice;
    private float  travelTime;
    private String departureStations;
    private  String endingStation;
    private  int numberOfWagons;

    public Train(String brand, String model, Integer year, String country, String color, int maxSpeed, float fuelPercentage, float tripPrice, float travelTime, String departureStations, String endingStation, int numberOfWagons) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        setTripPrice (tripPrice);
        setTravelTime(travelTime);
        setDepartureStations(departureStations);
        setEndingStation(endingStation);
        setNumberOfWagons(numberOfWagons);
    }

    public float getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(float tripPrice) {
        this.tripPrice = validateFloat (tripPrice,1f);
    }

    public float getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(float travelTime) {
        this.travelTime = validateFloat (travelTime, 3.5f);
    }

    public String getDepartureStations() {
        return departureStations;
    }

    public void setDepartureStations(String departureStations) {

        this.departureStations = validateString(departureStations,attention);
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = validateString(endingStation,attention);
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = validateInt (numberOfWagons,1);
    }

    @Override
    public String toString() {
        return "Поезд" + super.toString() +
                ", цена поездки " + tripPrice +
                " руб., время в пути " + travelTime +
                " ч., курсирует " + departureStations +
                " " + endingStation +
                ", в составе поезда " + numberOfWagons+" вагонов.";
    }

    @Override
    public void refill() {
        System.out.println("Заправить дизелем.");
        fuelPercentage=100.00f;
    }
}
