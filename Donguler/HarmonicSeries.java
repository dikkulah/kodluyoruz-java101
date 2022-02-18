package Donguler;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n;
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            result += (1d / i);
            System.out.println("Harmonik serinin "+i+". değeri "+1d+"/"+i);
        }
        System.out.println("Toplam: "+result);
    }
}
