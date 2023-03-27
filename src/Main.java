import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        ArrayList<Plant> plants = new ArrayList<>();


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
        c.setEdible(true);

        Plant d = new Plant();
        d.setTitle("Kraujalake");
        d.setLatinTitle("Sanguisorba");
        d.setAnnual(true);
        d.setContinent("Europa");
        d.setHeight(90);
        d.setEdible(false);



        plants.add(a);
        plants.add(b);
        plants.add(c);
        plants.add(d);




      while (true){
        Plant.info();
        int input = sc.nextInt();
        sc.nextLine();
        switch (input){
            case 1:
                Plant.printPlant();
                break;
            case 2:
                Plant.addPlant();
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println();
                break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("Pasirinkite validžią opciją");

        }
      }




    }
}