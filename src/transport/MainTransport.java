package transport;

public class MainTransport {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 2015, "Россия", "желтого", 0,40f , 1.7f);
        System.out.println(ladaGranta);
        Car audiA8 = new Car("Audi", "A8", 2020, "Германии", "черного", 0, 45f, 3.0f);
        System.out.println(audiA8);
        Car bmvZ8 = new Car("BMW", "Z8", 2021, "Германии", "черного", 0, 55.10f, 3.0f);
        System.out.println(bmvZ8);
        Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красного", 0, 99f, 2.4f);
        System.out.println(kiaSportage4);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевого", 0, 100f, 1.6f);
        System.out.println(hyundaiAvante);
        Train leningrad = new Train("Ленинград","B-901",2011,"России","красного",301,30.45f, 3500,0,"от Белорусского вокзала", "до станции Минск-Пассажирский",11);
        Train lastochka = new Train("Ласточка","D-125",2019,"России","красного",270,45.66f, 1700,0,"от Ленинградского вокзала", "до станции Ленинград-Пассажирский",8);
        lastochka.refill();
        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus zil1 = new Bus("ЗИЛ","325010",1999,"России", "белого", 150,55.0f);
        Bus zil2 = new Bus("ЗИЛ","325000",2000,"России", "синего", 140,55f);
        Bus zil3 = new Bus("ЗИЛ","325010-04",2001,"России", "серого", 160,67f);

        System.out.println(zil1);
        System.out.println(zil2);
        System.out.println(zil3);
    }
}