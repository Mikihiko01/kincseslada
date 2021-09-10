package kincseslada;

import java.util.Scanner;

public class ladak {

    String[] ladak = {"Arany", "Ezüst", "Bronz"};
    String arany = "Én rejtem a kincset";
    String ezust = "Nem én rejtem a kincset";
    String bronz = "Az arany láda hazudik";

    public void tablak() {
        System.out.printf("Arany mondja:%s\n", arany);
        System.out.printf("Ezüst mondja:%s\n", ezust);
        System.out.printf("Bronz mondja:%s\n", bronz);
    }

    public void kezdet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A három küzül válasz,de egy számot adj meg: ");
        int szam = sc.nextInt();

        if (szam == ladak.length) {
            System.out.println("itt van a kincs ");
        } else {
            if (szam == ladak.length - 1) {
                System.out.println("itt nincs a kincs");
            } else {
                if (szam == ladak.length - 2) {
                    System.out.println("itt nincs a kincs ");
                }
            }
        }
    }
}
