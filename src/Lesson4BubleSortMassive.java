import java.util.Random;
import java.util.Scanner;

public class Lesson4BubleSortMassive {

    public static void main(String[] args) {

        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//Вводим длину массива с клавиатуры

        int[] array = new int[a];//объявление и создание(выделение памяти) для массива с А кол-вом эл-тов;

        int min = 0;
        int max = 16;
        int diff = max - min;
        Random random = new Random();//Задаем функцию рандома от 0 до 16;*/

        /*Более простой способ, если задать фиксированный, заполненный массив:
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println("64 42 73 41 32 53 16 24 57 42 74 55 36");*/


        for (int i = 0; i < array.length; i++) {        //!!!Цикл с заполнением по функуии рандом с выведением в консоль.
            array[i] = random.nextInt(diff);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        boolean isSorted = false;   //Устанавливаем флаг по умолчанию, что отсортирован = фолс
        while (!isSorted) {   //пока не отсортирован --> выполняй цикл
            isSorted = true;   //считаем что массив отсортирован
            for (int i = 1; i < array.length; i++) {       // Сравнение и Замена 2х элементов
                if (array[i - 1] > array[i]) {
                    int temporary = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temporary;
                    isSorted = false;   //если происходит хотябы одна перестановка то сбрасываем обратно в фолс
                }
            }
        }
        for (int i = 0; i < array.length; i++) {   //Выводим отсортированный массив
            System.out.print(array[i] + " ");
        }
    }
}

