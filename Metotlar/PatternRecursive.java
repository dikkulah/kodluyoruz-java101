package Metotlar;

import java.util.Scanner;

public class PatternRecursive {
    static boolean state = false;
    static void pattern(int number, int temp) {

        System.out.print(number + " ");
        if (number > 0 && !state) {
            pattern(number - 5, temp);
        } else {
            state = true;
            if (number < temp) pattern(number + 5, temp);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();
        pattern(number, number);

    }
}
