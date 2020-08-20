import java.util.Scanner;

public class DomZad2 {
    public static void main(String[] args) {

        //Класс Scanner(java.util) используется для считывания введенных пользователем данных следующих типов: String, byte, short, int, long, float, double.
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (input.hasNextInt()) {
            int number = input.nextInt();
            if (number == 0) {
                System.out.println("Это ноль");
            } else if (number > 0 && number <= 9) {
                System.out.println("Число однозначное, положительное ");
            } else if (number > 9 && number < 100) {
                System.out.println("Число двузначное, положительное ");
            } else if (number > -10 && number < 0) {
                System.out.println("Число однозначное, отрицательное  ");
            } else if (number > -100 && number <= -10) {
                System.out.println("Число двузначное, отрицательное  ");
            }

        } else {
            System.out.println("Введите целое число. ");
        }

    }
}

