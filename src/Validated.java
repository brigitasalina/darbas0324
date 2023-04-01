import java.util.Scanner;

public class Validated {


    public static int height(Scanner sc) {
        while (true) {
            int num = integer(sc);
            if (num >= 0 && num < 1000) {
                return num;
            }
            System.out.println("Prasome iveskite teisingai centimetrus");
        }

    }

    public static int integer(Scanner sc) {
        int input = 0;
        boolean shouldGo = true;
        while (shouldGo) {
            try {
                input = sc.nextInt();
                shouldGo = false;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Pasirinkite teisinga skaiciu");
            }
        }
        return input;
    }

    public static boolean bool(Scanner sc) {
        boolean input = false;
        boolean shouldGo = true;
        while (shouldGo) {
            try {
                input = sc.nextBoolean();
                shouldGo = false;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Iveskite teisinga reiksme (true/false)");
            }
        }
        return input;
    }

    public static String string(Scanner sc) {
        while (true) {

            String input = sc.nextLine();

            if (input.trim().length() != 0 &&
                    input.replaceAll("[^a-zA-Z0-9ąčęėįšųūžĄČĘĖĮŠŲŪŽ ]", "").length() == input.length() &&
                    input.replaceAll("[^0-9]", "").length() != input.length()
            ){
                input = input.trim().replaceAll(" +", " ");
                String[] pieces = input.split(" ");
                String result = "";
                for (int i = 0; i < pieces.length; i++) {
                  result += pieces[i].toUpperCase().charAt(0) + pieces[i].toLowerCase().substring(1, pieces[i].length()) + " ";

                }
                return result.trim();

            }
            System.out.println("Iveskite teisinga zodi");
        }

    }
}