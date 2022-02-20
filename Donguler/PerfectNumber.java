package Donguler;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " Mükemmel sayıdır");
        } else System.out.println(number + " Mükemmel sayı değildir.");

    }
}
