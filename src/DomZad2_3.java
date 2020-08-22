import java.util.Scanner;

public class DomZad2_3 {
    public static void main(String[] args) {
        //Дано целое число. Если с + то +1, если с - то -2. Если 0 то 10.

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (input.hasNextInt()) {
            int number = input.nextInt();
            if (number == 0) {
                int numZero = number + 10;
                System.out.println("Это ноль. " + numZero);
            } else if (number > 0) {
                int numPositive = number + 1;
                System.out.println("Число положительное. " + numPositive);
            } else {            //java: else if (number < 0) { -- condition is always true, unwrap if statement
                int numNegative = number - 2;
                System.out.println("Число отрицательное. " + numNegative);
            }
        } else {
            System.out.println("Введите целое число. ");
        }
    }
}


