import java.util.Scanner;

public class DomZad2_5 {
    public static void main(String[] args) {
        //3 целых числа. Вывести кол-во + и -.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1е число: ");
        int a = sc.nextInt();
        System.out.println("Введите 2е число: ");
        int b = sc.nextInt();
        System.out.println("Введите 3е число: ");
        int c = sc.nextInt();
        int posQty = 0;
        int negQty = 0;

        if (a > 0) {
            posQty++;
        } else if (a < 0) {
            negQty++;
        }
        if (b > 0) {
            posQty++;
        } else if (b < 0) {
            negQty++;
        }
        if (c > 0) {
            posQty++;
        } else if (c < 0) {
            negQty++;
        }
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Введите положительное или отрицательное число.");
        }

        System.out.println("Кол-во положительных элементов: " + posQty);
        System.out.println("Кол-во отрицательных элементов: " + negQty);
    }
}






