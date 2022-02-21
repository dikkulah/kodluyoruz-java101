package Metotlar;

import java.util.Scanner;

public class PrimeNumberRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int number = scanner.nextInt();
        if (isPrime(number,2)) System.out.println(number+" asal bir sayıdır.");
        else System.out.println(number+" asal bir sayı değildir.");


    }

    private static boolean isPrime(int number,int i) {
        if (i<number){
            if (number%i != 0) return isPrime(number,++i);
            else return false;
        }
        return true;
    }
}
