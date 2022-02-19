package Donguler;

import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        int ebob = 0, ekok = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = scanner.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = scanner.nextInt();
        // ilk sayı daha büyükse yer değiştirme
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int k = 1;
        while (k != n1) {
            if ((n1 % k == 0) && (n2 % k == 0)) {
                ebob = k;
            }
            k++;
        }

        int j = 1;
        while ((n1 * n2) >= j) {
            if ((j % n1 == 0) && (j % n2 == 0)) {
                ekok = j;
                break;
            }
            j++;
        }


        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

    }
}
