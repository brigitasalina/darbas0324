import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Plant a = new Plant();
        a.setTitle("Rope");
        a.setLatinTitle("Brassica rapa");
        a.setAnnual(true);
        a.setContinent("Europa, Azija");
        a.setHeight(55);
        a.setEdible(true);

        Plant b = new Plant();
        b.setTitle("Rukola");
        b.setLatinTitle("Eruca sativa");
        b.setAnnual(false);
        b.setContinent("Azija, Centrine Europa");
        b.setHeight(50);
        b.setEdible(true);

        Plant c = new Plant();
        c.setTitle("Saulegraza");
        c.setLatinTitle("Helianthus");
        c.setAnnual(false);
        c.setContinent("Siaures Amerika");
        c.setHeight(200);
        c.setEdible(false);

        Plant d = new Plant();
        d.setTitle("Kraujalake");
        d.setLatinTitle("Sanguisorba");
        d.setAnnual(true);
        d.setContinent("Europa");
        d.setHeight(90);
        d.setEdible(false);

        Plant.plants.add(a);
        Plant.plants.add(b);
        Plant.plants.add(c);
        Plant.plants.add(d);

        while (true) {
            Plant.info();
            int input = Validated.integer(sc);


            switch (input) {
                case 1:
                    Plant.printPlant();
                    break;
                case 2:
                   Plant.filter();
                    break;
                case 3:
                    Plant.addPlant();
                    break;
                case 4:
                  Plant.editPlant();
                    break;
                case 5:
                    Plant.deletePlant();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Prasome pasirinkti validzia opcija");
            }
        }

    }
}