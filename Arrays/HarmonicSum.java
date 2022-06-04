package Arrays;

public class HarmonicSum {
    public static void main(String[] args) {
        int[] list = {15, 1, 7, 11, 2};


        double sum = 0;
        System.out.print("Sayı giriniz: ");

        for (int eleman : list) {
            sum += 1d / eleman;
        }
        System.out.println("Harmonik  ortalama: " + list.length / sum);

    }
}
