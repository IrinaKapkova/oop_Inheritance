package animals;

import animals.amphibian.Amphibian;
import animals.bird.Flightless;
import animals.bird.Flying;
import animals.mammal.Herbivore;
import animals.mammal.Predator;

public class MainAnimal {
    public static void main(String[] args) {
        Herbivore giraffe = new Herbivore(

                "жираф",
                4,"Саванна", 60, "листья");

        Herbivore gazelle = new Herbivore("газель",5, "cтепи", 97,"листья и ветки");
        Herbivore horse = new Herbivore("лошадь", 6, "пастбище", 88,"трава");
        System.out.println(giraffe);
        giraffe.PrintInfo();
        System.out.println(horse);
        horse.PrintInfo();
        System.out.println(gazelle);
        gazelle.PrintInfo();
        Predator hyena=new Predator("гиена", 3,"территория Африки и юго-западной Азии",64,"животная пища, падаль");
        System.out.println(hyena);
        hyena.PrintInfo2();
        Predator tiger=new Predator("тигр", 5,"Бангладеш, Бутан, Вьетнам, Индия, Индонезия, Камбоджа, Китай, КНДР (не подтверждено), Лаос, Малайзия, Мьянма, Непал, Россия, Таиланд",60,"животная пища");
        System.out.println(tiger);
        tiger.PrintInfo2();
        Predator bear=new Predator("медведь", 3,"леса с лесосеками, гарями, болотами и полянами",
                55,"животная и растительная пища");
        System.out.println(bear);
        bear.PrintInfo2();
        Amphibian frog = new Amphibian("Квак", 1, "река") {
            @Override
            public void hunt() {
                System.out.println("Я охочусь  за насекомыми");
            }
        };
        Amphibian alreadyFreshwater = new Amphibian("уж пресноводный", 0,"озеро") {
            public void hunt() {
            }
        };
        System.out.println(frog);
        frog.PrintInfo3();
        System.out.println(alreadyFreshwater);
        alreadyFreshwater.PrintInfo3();
        Flightless peacock = new Flightless("павлин",2,"вольер","всеядный");
        System.out.println(peacock);
        peacock.PrintInfo4();
        Flightless penguin = new Flightless("пингвин",2,"океан","рыба");
        System.out.println(penguin);
        penguin.PrintInfo4();
        Flightless dodo = new Flightless("Птица Додо",1,"Остров Маврикий в Индийском океане","фркукты");
        System.out.println(dodo);
        dodo.PrintInfo4();
        Flying seagull=new Flying("чайка",2,"море", "рыба");
        System.out.println(seagull);
        seagull.PrintInfo5();
        Flying albatross =new Flying("альбатрос ",2,"море", "рыба");
        System.out.println(albatross );
        albatross.PrintInfo5();
        Flying falcon=new Flying("сокол",3,"степь", "грызуны");
        System.out.println(falcon);
        falcon.PrintInfo5();

    }


}

