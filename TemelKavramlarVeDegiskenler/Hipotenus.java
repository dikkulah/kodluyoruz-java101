package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dik üçgenin 1. kenarını giriniz : ");
        a = scanner.nextInt();
        System.out.print("Dik üçgenin 2. kenarını giriniz : ");
        b = scanner.nextInt();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Üçgenin hipotenüsü : " + c);

    }
}
