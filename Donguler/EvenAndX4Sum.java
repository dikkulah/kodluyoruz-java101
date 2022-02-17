package Donguler;

import java.util.Scanner;

public class EvenAndX4Sum {
    public static void main(String[] args) {
        int count = 0, n, sum = 0;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Sayı giriniz: ");
            n = scanner.nextInt();
            if (n % 4 == 0) {
                sum += n;
                count++;
            }
        } while (n % 2 == 0);
        System.out.println(sum / count);
    }
}
