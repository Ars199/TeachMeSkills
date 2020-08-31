import java.util.Random;
import java.util.Scanner;

public class DomZad3_2 {

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

        boolean isSorted = false;   //Устанавливаем флаг по умолчанию, что отсортирован = фолс
        while (!isSorted) {   //пока не отсортирован --> выполняй цикл
            isSorted = true;   //считаем что массив отсортирован
            for (int i = 0; i < myList.length - 1; i++) {
                for (int j = 0; j < myList[i].length - 1; j++) {  //Поскольку внутренний цикл ссылается на arr[j+1], он должен завершиться на один шаг раньше
                    if (myList[i][j] > myList[i + 1][j + 1]) {
                        int temporary = myList[i + 1][j + 1];
                        myList[i][j] = myList[i + 1][j + 1];
                        myList[i + 1][j + 1] = temporary;
                        isSorted = false;   //если происходит хотябы одна перестановка то сбрасываем обратно в фолс

                    }
                }
            }
        }
        System.out.println(" ");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(myList[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}




