package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class TaxiMetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, fiyat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi Km cinsinden giriniz : ");
        km = scanner.nextInt();

        fiyat = km * perKm + 10;

        System.out.println("Ödenecek tutar" + ((fiyat < 20) ? 20 : fiyat));
    }
}
