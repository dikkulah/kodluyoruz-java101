package MayinTarlasi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSwapper {
    int row, col;
    Scanner scanner = new Scanner(System.in);

    char[][] field, view;

    public MineSwapper(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void createField() {
        field = new char[row][col];
        view = new char[row][col];
        for (char[] row : field) {
            Arrays.fill(row, '-');
        }
        for (char[] row : view) {
            Arrays.fill(row, '-');
        }

    }

    public void printField(char[][] table) {
        for (char[] row : table) {
            for (char a : row) {
                System.out.print(" " + a + " ");
            }
            System.out.println();
        }
    }

    public void addMine() {
        Random rand = new Random();
        int numMines = (row * col) / 4;
        for (int i = 0; i < numMines; i++) {
            int randomRow = rand.nextInt(row);
            int randomCol = rand.nextInt(col);
            if (field[randomRow][randomCol] == '-') field[randomRow][randomCol] = '*';
            else if (field[randomRow][randomCol] == '*') numMines++;
        }
    }


    public int[] fieldSelect() {
        int r, c;
        System.out.print("Satır: ");
        r = scanner.nextInt();
        while (r < 0 || r > row) {

            System.out.print("Geçerli bir satır girin: ");
            r = scanner.nextInt();
        }
        System.out.print("Sütun: ");
        c = scanner.nextInt();
        while (c < 0 || c > col) {

            System.out.print("Geçerli bir satır girin: ");
            c = scanner.nextInt();
        }
        return new int[]{r, c};
    }

    void run() {
        createField();
        addMine();
        printField(field);
        System.out.println("-----------------------");
        printField(view);


        int loop = (row * col) - (row * col) / 4;
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        while (loop > 0) {
            int[] selected = fieldSelect();
            if (field[selected[0]][selected[1]] == '*') {
                System.out.println("Game Over!");
                break;
            } else {
                int point = 0;
                if (field[selected[0]][selected[1]] == '-') {
                    if (selected[0] - 1 >= 0 && selected[1] - 1 > 0) {
                        char c1 = field[selected[0] - 1][selected[1] - 1];
                        if (c1 == '*') {
                            point++;
                        }
                    }
                    if (selected[0] + 1 <= row-1 && selected[1] + 1 <= col-1) {
                        char c8 = field[selected[0] + 1][selected[1] + 1];
                        if (c8 == '*') {
                            point++;
                        }
                    }
                    if (selected[0] + 1 <= row-1 && selected[1] - 1 >= 0) {
                        char c7 = field[selected[0] + 1][selected[1] - 1];
                        if (c7 == '*') {
                            point++;
                        }
                    }
                    if (selected[0] - 1 >= 0 && (selected[1] + 1 ) <= col-1) {
                        char c7 = field[selected[0] - 1][selected[1] + 1];
                        if (c7 == '*') {
                            point++;
                        }
                    }
                    if (selected[1] - 1 >= 0) {
                        char c2 = field[selected[0]][selected[1] - 1];
                        if (c2 == '*') {
                            point++;
                        }
                    }
                    if (selected[1] + 1 <= col-1) {
                        char c6 = field[selected[0]][selected[1] + 1];
                        if (c6 == '*') {
                            point++;
                        }
                    }
                    if (selected[0] - 1 >= 0) {
                        char c3 = field[selected[0] - 1][selected[1]];
                        if (c3 == '*') {
                            point++;
                        }
                    }
                    if (selected[0] + 1 <= row-1) {
                        char c5 = field[selected[0] + 1][selected[1]];
                        if (c5 == '*') {
                            point++;
                        }
                    }


                    view[selected[0]][selected[1]] = (char) (point + '0');
                }

            }
            System.out.println("----------------");
            printField(view);


            loop--;
        }

    }
}
