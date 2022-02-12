import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14, alan;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = scanner.nextInt();

        System.out.print("Merkez açısı giriniz : ");
        a = scanner.nextInt();


        alan = (pi * Math.pow(r, 2) * a) / 360;
        System.out.println(r + " Yarıçaplı ve " + a + "° Merkez açılı dilimin alanı : " + alan);

    }
}
