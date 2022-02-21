package Metotlar;

import java.util.Scanner;

public class Palindrom {
    static boolean isPolindrom(int number) {
        int temp = number;
        int reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            temp /= 10;

        }

        return reverseNumber==number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        if (isPolindrom(number)){
            System.out.println("Sayı palindrom bir sayı");
        }else System.out.println("Sayı palindrom bir sayı değildir!!");


    }


}



