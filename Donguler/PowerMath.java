package Donguler;

import java.util.Scanner;

public class PowerMath {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = scanner.nextInt();

        System.out.println("----- 4 ün kuvvetleri------");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }
        System.out.println("----- 5 in kuvvetleri------");

        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}
