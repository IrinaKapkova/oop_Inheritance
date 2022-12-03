package animals.bird;

import java.util.Objects;

import static transport.ValidateUtils.validateString;

public class Flying extends Bird{
    private String movementType;
    public Flying(String nickname, int year, String habitat, String movementType) {
        super(nickname, year, habitat);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = validateString(movementType,"не указан тип");
    }

    public void fly() {
        System.out.println("Я летаю");
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
        System.out.println("Я летаю с ветки на ветку");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying that = (Flying) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Я летающая птица отношусь к животным " +getNickname()+"\n"+
                " мой возраст "+getYear()+" лет,среда обитания"+getHabitat()+
                " способ передвижения " + getMovementType() ;
    }
}
