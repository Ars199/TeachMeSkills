import java.util.Random;
import java.util.Scanner;

public class DomZad3_1 {

    public static void main(String[] args) {
        System.out.print("1й массив (длину)(строки): ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("2й массив (ширину)(колонки): ");
        int b = sc.nextInt();

        int min = 0;
        int max = 9;
        int diff = max - min;
        Random random = new Random();

        int[][] myList = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                myList[i][j] = random.nextInt(diff);
                System.out.print(myList[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}

