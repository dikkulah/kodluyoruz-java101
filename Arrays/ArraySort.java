package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutu giriniz: ");
        int[] arr = new int[scanner.nextInt()];

        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanı: ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sıralama: ");
        for (int i : arr) {
            System.out.print(i + " ") ;
        }
    }
}
