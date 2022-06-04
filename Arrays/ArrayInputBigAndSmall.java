package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputBigAndSmall {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();
        int min = list[0];
        int max = list[0];

        Arrays.sort(list);
        for (int i: list){
            if (n>i){
                min = i;
            }
            if (n<i){
                max =i;
                break;
            }
        }


        System.out.println("Minimum Değer " +min);
        System.out.println("Maximum Değer " + max);

    }

}
