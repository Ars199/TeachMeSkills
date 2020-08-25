
public class Practice1While {
    public static void main(String[] args) {
        int x1 = 1;
        System.out.println("Перед началом цикла");
        while (x1 < 4) {
            System.out.println("Внутри цикла");
            System.out.println("Значение Х равно " + x1);
            x1 = x1 + 1;
        }
        System.out.println("-------второй пример-----------");

        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.print("Do");
        }
    }
}














