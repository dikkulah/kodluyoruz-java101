package Donguler;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basValue;
        int result = 0;

        while (number != 0) {
            basValue = number % 10;
            result += basValue;
            number /= 10;

        }
        System.out.println(result);


    }
}
