import java.util.Scanner;

public class DomZad2_6 {
    public static void main(String[] args) {
        //2 целых числа. Вывести бОльшее.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1е число: ");
        int a = sc.nextInt();
        System.out.println("Введите 2е число: ");
        int b = sc.nextInt();

      /*  if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        }*/

        //Тернарный оператор. одно условие — два возможных результата. <логическое выражение> ? <выражение1> : <выражение2>

        String result = a > b ? "1е число > 2го: " + a : "2е число > 1го: " + b;

        System.out.println(result);

    }
}






