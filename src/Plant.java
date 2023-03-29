import java.util.ArrayList;
import java.util.Scanner;

public class Plant {

    public static ArrayList<Plant> plants = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    private static int idCount = 0;

    private int id;
    private String title;
    private String latinTitle;

    private boolean annual;
    private String continent;
    private int height;
    private boolean edible;

    public Plant() {
        this.id = ++idCount;

    }

    public Plant(int id) {
        this.id = id;

    }

    public Plant(String title, String latinTitle, boolean annual, String continent, int height,
                 boolean edible) {
        this.id = ++idCount;
        this.title = title;
        this.latinTitle = latinTitle;
        this.annual = annual;
        this.continent = continent;
        this.height = height;
        this.edible = edible;

    }

    public int getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;

    }

    public void setLatinTitle(String latinTitle) {
        this.latinTitle = latinTitle;
    }

    public String getLatinTitle() {
        return this.latinTitle;

    }

    public void setAnnual(boolean annual) {
        this.annual = annual;
    }

    public boolean annual() {
        return this.annual;

    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return this.continent;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;

    }

    public void setEdible(boolean edible) {
        this.title = title;
    }

    public boolean getEdible() {
        return this.edible;

    }

    @Override
    public String toString() {
        return this.id + ". Pavadinimas " + title + ", lotyniskas pavadinimas " + latinTitle + ", augalas yra " + (this.annual ? "vienmetis" : "daugiametis") +
                ", auga " + continent + ", suaugusio augalo aukstis " + height / 100.0 + "m" + ", augalas yra" + " " + (this.edible ? "valgomas" : " nevalgomas");

    }

    public static void info() {
        System.out.println("1. Pamatyti sąrašą");
        System.out.println("2. Pridėti augalą");
        System.out.println("3. Redaguoti augalą");
        System.out.println("4. Ištrinti augalą");
        System.out.println("5. Išeiti iš programos");

    }

    public static void printPlant() {
        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i));
        }
    }

    public static void addPlant(){
        Plant.plants.add(createPlant(0));
    }


    public static void editPlant() {
        System.out.println("Iveskite augalo id kuri norite redaguoti:");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).id == id) {
            plants.set (i,createPlant(id));
                return;
            }
        }
    }
    public static Plant createPlant(int id){
        Plant a;
        if (id == 0){
             a = new Plant();
        }else{
             a = new Plant(id);
        }
        System.out.println("Įveskite augalo pavadinimą");
        a.setTitle(sc.nextLine());
        System.out.println("Įveskite augalo lotynišką pavadinimą");
        a.setLatinTitle(sc.nextLine());
        System.out.println("Įveskite ar augalas daugiametis true/false");
        a.setAnnual(sc.nextBoolean());
        System.out.println("Įveskite kuriame kontinente auga augalas");
        a.setContinent(sc.nextLine());
        a.setContinent(sc.nextLine());
        System.out.println("Įveskite augalo aukštį metrais");
        a.setHeight(sc.nextInt());
        System.out.println("Įveskite ar augalas valgomas true/false");
        a.setEdible(sc.nextBoolean());
        sc.nextLine();
        return a;

    }
        public static void deletePlant () {
            System.out.println("Iveskite augalo id kuri norite trinti:");
            int id = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < plants.size(); i++) {
                if (plants.get(i).id == id) {
                    plants.remove(i);
                    return;
                }
            }
        }


    }