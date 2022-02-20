package Donguler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, temp1 = 0, temp2 = 1, temp3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scanner.nextInt();

        System.out.print("0 1");
        for (int i = 1; i < n; i++) {
            temp3 = temp1 + temp2;
            System.out.print(" " + temp3);
            temp1 = temp2;
            temp2 = temp3;
        }
    }
}
