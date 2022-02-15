package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class PlaneTicketCalculator {
    public static void main(String[] args) {
        int age, km, typeTrip;
        double perKm = 0.10, price , ageDiscount ,tripDiscount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = scanner.nextInt();
        if (km <= 0) {
            do {
                System.out.print("Hatalı Veri Girdiniz ! Pozitif bir mesafe giriniz : ");
                km = scanner.nextInt();
            } while (km <= 0);

        }
        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();
        if (age <= 0) {
            do {
                System.out.print("Hatalı Veri Girdiniz !Pozitif bir yaş giriniz : ");
                age = scanner.nextInt();
            } while (age <= 0);
        }

        System.out.println("---------\n1-Tek Yön \n2-Gidiş-Dönüş");
        System.out.print("Yolculuk tipini giriniz : ");

        typeTrip = scanner.nextInt();
        if (!(typeTrip == 1 || typeTrip == 2)) {
            do {
                System.out.println("---------\nHatalı Seçim \n1-Tek Yön \n2-Gidiş-Dönüş");
                System.out.print("Yolculuk tipini giriniz : ");
                typeTrip = scanner.nextInt();
            } while (!(typeTrip == 1 || typeTrip == 2));
        }


        if (age < 12) {
            ageDiscount = 0.5;
        } else if (age < 24) {
            ageDiscount = 0.1;
        } else if (age > 65) {
            ageDiscount = 0.3;
        }else ageDiscount =0;

        if (typeTrip==2){
            tripDiscount=0.2;
            price = km*perKm*2;
        }else {
            tripDiscount = 0;
            price = km*perKm;
        }


        double ageDiscountPrice = ageDiscount*price;
        price = price-ageDiscountPrice;
        double tripDiscountPrice= tripDiscount*price;
        price = price-tripDiscountPrice;
        System.out.println("Toplam Tutar: "+price+" TL");




    }
}
