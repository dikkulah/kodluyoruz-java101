package Arrays;

public class HarmonicSum {
    public static void main(String[] args) {
        int[] list = {15, 1, 7, 11, 2};


        double result = 0;
        double sum = 0;
        System.out.print("Sayı giriniz: ");

        for (int eleman : list) {
            for (int i = 1; i <= eleman; i++) {
                result += (1d / i);
                System.out.println("Harmonik serinin " + i + ". değeri " + 1d + "/" + i);
            }
            System.out.println(eleman + " sayısının Harmonik Toplamı : " + result);
            sum += result;
            result = 0;

        }
        System.out.println("Harmonik serilerin ortalaması: "+ sum/ list.length);

    }
}
