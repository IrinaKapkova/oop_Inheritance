package animals.bird;

import animals.Animal;

import java.util.Objects;

import static transport.ValidateUtils.validateString;

public class Bird extends Animal {
    private String habitat;

    public Bird(String nickname, int year, String habitat) {
        super(nickname, year);
        setHabitat(habitat);

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = validateString(habitat, "Не указана среда обитания");
    }


    public void hunt(){
        System.out.println("Я охочусь");
    }

    @Override
    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public void sleep() {
        System.out.println("Я сплю");
    }

    @Override
    public void move() {
        System.out.println("Я двигаюсь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(habitat, bird.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
