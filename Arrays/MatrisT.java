package Arrays;

import java.util.Arrays;

public class MatrisT {
    public static void main(String[] args) {
        int[][] matris = {{2, 3, 4}, {5, 6, 7}};
        int[][] transpoz = new int[3][2];

        System.out.println("Matris: ");
        for (int[] num : matris) {
            for (int n : num) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
        System.out.println("Transpoz: ");
        for (int i = 0;i< transpoz.length;i++){
            for (int j =0;j< transpoz[i].length;j++){
                transpoz[i][j] = matris[j][i];

            }
        }
        for (int[] num : transpoz) {
            for (int n : num) {
                System.out.print(n+" ");
            }
            System.out.println();
        }


    }
}
