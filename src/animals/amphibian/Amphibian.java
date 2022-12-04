package animals.amphibian;

import animals.Animal;

import java.util.Objects;

import static transport.ValidateUtils.validateString;

public class Amphibian extends Animal {
    private String habitat;
    public Amphibian(String nickname, int year, String habitat) {
        super(nickname, year);
        setHabitat(habitat);
    }


    @Override
    public void eat(){
        System.out.println(getNickname()+" ест");
    }

    @Override
    public void sleep() {
        System.out.println(getNickname()+" спит");
    }

    @Override
    public void move() {
        System.out.println(getNickname()+" передвигается");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = validateString(habitat,"Не указана среда обитания");
    }
    public void hunt(){
        System.out.println("Я охочусь ");
    }
    public String PrintInfo3() {
        sleep();
        hunt();
        move();
        return null;
    }
    @Override
    public
    String toString() {
        return "Я земноводное животное " + getNickname()+" возраст которого "+getYear()+" лет, среда проживания "+ getHabitat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(habitat, amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
