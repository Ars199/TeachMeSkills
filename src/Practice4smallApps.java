
public class Practice4smallApps {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x -= 1;//x=x-1
            }
        }
        System.out.println("");
        System.out.println("-------второй пример-----------");
        int x1 = 5;
        while (x1 > 1) {
            x1 = x1 - 1;
            if (x1 < 3) {
                System.out.println("малый икс");
            }
        }
        System.out.println("-------3й пример-----------");
        int x2 = 1;
        while (x2 < 10) {
            x2 = x2 - 6;
            if (x2 > 3) {
                System.out.println("большой икс");
            }
        }
        System.out.println("-------4й пример-----------");
        int x3 = 5;
        while (x3 > 1) {
            x3 = x3 - 1;
            if (x3 < 3) {
                System.out.println("маленький икс");
            }
        }
    }
}










