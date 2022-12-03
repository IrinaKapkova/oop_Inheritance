package animals.mammal;

import static transport.ValidateUtils.validateString;

public class Herbivore extends Mammal{

private String typeOfFood;
    public Herbivore(String nickname, int year, String habitat ,int travelSpeed, String typeOfFood) {
        super(nickname, year, habitat, travelSpeed);
        setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = validateString(typeOfFood,"Не указана среда обитания");
    }

    public void graze(){
        System.out.println("Гуляет по саванне ест листья дереьев");
    }
    @Override
    public void eat() {
        System.out.println("Я ем траву и листья.");
    }
    public String PrintInfo() {
        eat();
        sleep();
        move();
        walk();
        return null;
    }
    @Override
    public String toString() {

        return
                "Я травоядное млекопитающее животное " + getNickname() + ", мой возраст=" + getYear()+" года." +"\n"+
                        " Моя среда обитания " + getHabitat()  +
                        " Моя скорость передвижения составляет в среднем " + getTravelSpeed() +" км в час"+
                ", я ем -" + getTypeOfFood();
    }
}
