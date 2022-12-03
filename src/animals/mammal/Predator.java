package animals.mammal;
import static transport.ValidateUtils.validateString;

public class Predator extends Mammal{

    private String typeOfFood;
    public Predator(String nickname, int year, String habitat ,int travelSpeed, String typeOfFood) {
        super(nickname, year, habitat, travelSpeed);
        setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = validateString(typeOfFood,"Не указана среда обитания");
    }

    public void hunt(){
        System.out.println("Я охочусь");
    }
    @Override
    public void eat() {
        System.out.println("Я ем животную и растительную пищу");
    }
    public String PrintInfo2() {
        eat();
        sleep();
        move();
        hunt();
        return null;
    }
    @Override
    public String toString() {
        return
                "Я хищное млекопитающее животное " + getNickname() + ", мой возраст=" + getYear()+" года" +
                        " Моя среда обитания " + getHabitat()  +"\n"+
                        " Моя скорость передвижения составляе в среднем " + getTravelSpeed() +" км в час"+
                        ", моя еда это " + getTypeOfFood();
    }
}

