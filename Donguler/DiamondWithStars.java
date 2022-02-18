package Donguler;

import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + (i - 1)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + (i - 1)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
