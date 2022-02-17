package Donguler;

import java.util.Scanner;

public class BolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int k ,sum=0,count=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = scanner.nextInt();
        //0 hariç
        for(int i =1; i <=k;i++){
            if(i%3==0 || i%4==0){
               sum+=i;
               count++;
            }

        }
        System.out.println("Tam bölünen sayıların ortalaması: "+sum/count);
    }
}
