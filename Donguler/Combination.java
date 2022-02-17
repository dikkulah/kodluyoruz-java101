package Donguler;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, r, nFac = 1, rFac = 1, nrFac = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("C(n,r): n sayısını giriniz: ");
        n = scanner.nextInt();
        System.out.print("C(n,r): r sayısını giriniz: ");
        r = scanner.nextInt();
        int nr = n - r;
        while (n > 0 || r > 0 || (nr) > 0) {
            if (n > 0) {
                nFac = nFac * n;
                n--;
            } else if (r > 0) {

                rFac = rFac * r;
                r--;
            } else if ((nr) > 0) {
                nrFac = nrFac * nr;
                nr--;
            }
        }
        System.out.println("Kombinasyon Sonucu: " + nFac / (rFac * nrFac));
    }
}
