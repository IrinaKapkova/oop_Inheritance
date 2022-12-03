package animals;

import java.util.Objects;

import static transport.ValidateUtils.validateInt;
import static transport.ValidateUtils.validateString;

public abstract class Animal {

        private final String  nickname;
        private  int year;

    public Animal(String nickname, int year) {
        this.nickname= validateString(nickname,"Животное");
        setYear(year);
    }

    public final String getNickname() {
        return nickname;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = validateInt (year, 0);
        }
    public abstract void eat();

    public abstract void sleep() ;

    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return year == animal.year && Objects.equals(nickname, animal.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, year);
    }

}

