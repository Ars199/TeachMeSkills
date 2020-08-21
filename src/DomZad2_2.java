import java.util.Scanner;

public class DomZad2_2 {
    public static void main(String[] args) {
        //Если сумма любых двух сторон треугольника больше 3й то треуг существует. Сравнить L каждого отрезка с суммой 2х других.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону A: ");
        int a = sc.nextInt();
        System.out.println("Введите сторону B: ");
        int b = sc.nextInt();
        System.out.println("Введите сторону C: ");
        int c = sc.nextInt();

        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("Сторона A < суммы 2х других сторон. Треугольник существует.");
        } else {
            System.out.println("Сторона A < суммы 2х других сторон. Треугольник НЕ существует.");
        }
    }
}


