
public class Practice7massiveInit {

    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.5, 3.3};

        // Вывести на экран все элементы массива
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        System.out.println("Обращение ко второму элементу по индексу: " + myList[1]);
        // Сумма элементов массива
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total = total + myList[i];
        }
        System.out.println("Сумма чисел массива: " + total);
        // Нахождение среди элементов массива наибольшего
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Наибольший элемент: " + max);
    }
}