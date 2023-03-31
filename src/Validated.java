import java.util.Scanner;

public class Validated {
    public static int meter(Scanner sc){
         while (true){
        int num = integer(sc);
            if (num >= 0 && num < 1000){
                return  num;
            }
             System.out.println( "Prasome iveskite teisingai metrus");
             }

    }

    public static int integer(Scanner sc){
        int input = 0;
        boolean shouldGo = true;
        while (shouldGo){
            try{
                input = sc.nextInt();
                shouldGo = false;
            }catch (Exception e){
                sc.nextLine();
                System.out.println("Pasirinkite teisinga skaiciu");
            }
        }
        return input;
    }

    public static boolean bool(Scanner sc){
        boolean input = false;
        boolean shouldGo = true;
        while (shouldGo){
            try{
                input = sc.nextBoolean();
                shouldGo = false;
            }catch (Exception e){
                sc.nextLine();
                System.out.println("Iveskite teisinga reiksme (true/false)");
            }
        }
        return input;
    }


}
