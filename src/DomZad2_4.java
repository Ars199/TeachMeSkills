import java.util.Scanner;

public class DomZad2_4 {
    public static void main(String[] args) {
        //3 целых числа. Вывести положительные.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1е число: ");
        int a = sc.nextInt();
        System.out.println("Введите 2е число: ");
        int b = sc.nextInt();
        System.out.println("Введите 3е число: ");
        int c = sc.nextInt();

        if (a > 0) {
            System.out.println("1е число положительное. " + a);
        } else if (a < 0) {
            System.out.println("1е число отрицательное.");
        }
        if (b > 0) {
            System.out.println("2е число положительное. " + b);
        } else if (b < 0) {
            System.out.println("2е число отрицательное.");
        }
        if (c > 0) {
            System.out.println("3е число положительное. " + c);
        } else if (c < 0) {
            System.out.println("3е число отрицательное.");
        }
    }
}






