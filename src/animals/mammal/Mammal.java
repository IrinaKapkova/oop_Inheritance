package animals.mammal;

import animals.Animal;

import java.util.Objects;

import static transport.ValidateUtils.validateInt;
import static transport.ValidateUtils.validateString;

public class Mammal extends Animal {
    private String habitat;
    private int travelSpeed;

    public Mammal(String nickname, int year, String habitat, int travelSpeed) {
        super(nickname, year);
        setHabitat(habitat);
        setTravelSpeed(travelSpeed);

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = validateString(habitat, "Не указана среда обитания");
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        this.travelSpeed = validateInt(travelSpeed, 1);
    }

    @Override
    public void eat() {
        System.out.println("Ем пищу");
    }

    @Override
    public void sleep() {
        System.out.println("Когда устаю, сплю в своем жилище");
    }

    @Override
    public void move() {
        System.out.println("Перемещаюсь с помощью лап(ног)");
    }

    public void walk() {
        System.out.println("При хорошей погоде гуляю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return travelSpeed == mammal.travelSpeed && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, travelSpeed);
    }
}
