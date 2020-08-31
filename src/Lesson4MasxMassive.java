import java.util.Random;
import java.util.Scanner;

public class Lesson4MasxMassive {

    public static void main(String[] args) {
        System.out.println("1й массив (длину)(строки)");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("2й массив (ширину)(колонки)");
        int b = sc.nextInt();
        int min = 0;
        int max = 16;
        int diff = max - min;
        Random random = new Random();

        int[][] myList = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                myList[i][j] = random.nextInt(diff - 1);
                System.out.print(myList[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}

