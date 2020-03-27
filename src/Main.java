import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Geben Sie eine Zahl ein");
        Scanner s = new Scanner(System.in);
        try {
            int zahl = Integer.parseInt(s.nextLine());
            int zaehler = 0;
            int gz = 0;
            int faktorZehn = 1;
            int umgedrehteZahl = 0;
            int zwErgeb = zahl;

            while (zahl != 0) {
                zahl /= 10;
                zaehler++;
            }

            for (int i = 1; i < zaehler; i++) {
                faktorZehn *= 10;
            }
            while (zwErgeb != 0) {
                umgedrehteZahl = (zwErgeb % 10) * faktorZehn + umgedrehteZahl;
                zwErgeb = zwErgeb / 10;
                faktorZehn = faktorZehn / 10;
            }
            System.out.println("Die Umgekehrte Zahl lautet: " + umgedrehteZahl);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
            System.out.println("Du darfst nur ganze Zahlen benutzen");
        }
    }
}


