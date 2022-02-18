package Donguler;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        // BASAMAK SAYISI BULMA
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        // HER BASAMAĞI TOPLAMA
        tempNumber = number;
        for (int i = 1; i <= basNumber; i++) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }
        System.out.println(result);


    }
}
