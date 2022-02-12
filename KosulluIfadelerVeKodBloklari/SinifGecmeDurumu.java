package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik, count = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = scanner.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik = scanner.nextInt();
        System.out.print("Kimya Notunuz :");
        kimya = scanner.nextInt();
        System.out.print("Türkçe Notunuz :");
        turkce = scanner.nextInt();
        System.out.print("Tarih Notunuz :");
        tarih = scanner.nextInt();
        System.out.print("Müzik Notunuz :");
        muzik = scanner.nextInt();

        if ((mat <= 100 && mat >= 0)) {
            count++;
            sum = sum + mat;
        }
        if ((fizik <= 100 && fizik >= 0)) {
            count++;
            sum = sum + fizik;
        }
        if ((kimya <= 100 && kimya >= 0)) {
            count++;
            sum = sum + kimya;
        }
        if ((turkce <= 100 && turkce >= 0)) {
            count++;
            sum = sum + turkce;
        }
        if ((tarih <= 100 && tarih >= 0)) {
            count++;
            sum = sum + tarih;
        }
        if ((muzik <= 100 && muzik >= 0)) {
            count++;
            sum = sum + muzik;
        }

        double result = (double) sum / count;
        System.out.println("Ortalamanız : " + result);
        if (result >= 55) {
            System.out.println("Sınıfı Geçtiniz.");
        } else {
            System.out.println("Sınıfta Kaldınız");
        }
    }


}
