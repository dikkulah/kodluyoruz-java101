package Metotlar;

import java.util.Scanner;

public class PowRecursive {
    static double pow(double base,double pow){
        if (pow == 0.0){
            return 1;
        }
        // negatif üs hesaplama
        if (pow<0) {
            return (1 / base) * pow((base), pow + 1);
        }

        return base*pow(base,pow-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int pow = scanner.nextInt();
        System.out.println(pow(base,pow));
    }
}
