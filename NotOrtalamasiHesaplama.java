import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

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

        int ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        String sonuc = ortalama >= 60 ? "Tebrikler sınıfı geçtiniz." : "Malesef sınıfta kaldınız.";
        System.out.println(sonuc);
    }
}
