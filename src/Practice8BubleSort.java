import java.util.Scanner;

public class Practice8BubleSort {

    public static void main(String[] args) {
        int[] myList = {1, 2, 4, 3};

        // Выводим на экран все элементы массива
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        int max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Наибольший элемент: " + max);

    }
}

