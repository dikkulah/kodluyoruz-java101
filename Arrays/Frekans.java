package Arrays;

import java.util.Arrays;

public class Frekans {


    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Tekrar Sayıları");

        Arrays.sort(arr);
        int doNotRepeat = 0;

        for (int i = 0; i < arr.length; i++) {
            int frekans = 1;
            if (arr[i] != doNotRepeat) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        frekans++;
                        doNotRepeat = arr[i];
                    }
                }
                System.out.println(arr[i] + " sayısı " + frekans + " kere tekrar edildi.");


            }
        }
    }
}
