package Donguler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int count, temp;
        Integer max=null,min=null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        count = scanner.nextInt();
        int i = 1;

        if (count>1){
            do {
                System.out.print(i + ". sayıyı giriniz: ");
                temp = scanner.nextInt();
                if (max==null) max= temp;
                if (min==null) min= temp;
                if (temp > max) max = temp;
                if (temp < min) min = temp;
                i++;
                count--;


            } while (count > 0);
            System.out.println("En küçük sayı: " + min);
            System.out.println("En büyük sayı: " + max);
        }else System.out.println("Girilecek sayı adedi 1'den büyük olmalı, lütfen tekrar deneyiniz.");;


    }
}
