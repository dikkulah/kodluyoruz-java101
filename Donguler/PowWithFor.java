package Donguler;

import java.util.Scanner;

public class PowWithFor {
    public static void main(String[] args) {
        int number, pow, result = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        number = scanner.nextInt();
        System.out.print("Üs : ");
        pow = scanner.nextInt();


        for (int i = 1; i <= pow; i++) {
            result *= number;
        }
        System.out.println("Sonuç: "+result);
    }
}
