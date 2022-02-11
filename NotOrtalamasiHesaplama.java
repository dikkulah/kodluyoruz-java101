import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya,turkce,tarih,muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Notunuz :");
        mat=scanner.nextInt();
        System.out.println("Fizik Notunuz :");
        fizik=scanner.nextInt();
        System.out.println("Kimya Notunuz :");
        kimya=scanner.nextInt();
        System.out.println("Türkçe Notunuz :");
        turkce=scanner.nextInt();
        System.out.println("Tarih Notunuz :");
        tarih=scanner.nextInt();
        System.out.println("Müzik Notunuz :");
        muzik=scanner.nextInt();

        int ortalama= (mat+fizik+kimya+turkce+tarih+muzik)/6;
        String sonuc = ortalama >= 60
                ? "Tebrikler sınıfı geçtiniz."
                : "Malesef sınıfta kaldınız.";
        System.out.println(sonuc);
    }
}
