
public class DomZad2_14 {
    public static void main(String[] args) {
        //дорисовать треуги звездочками.

        int c = 4;
        for (int i = 0; i < c; i++) {
            for (int a = 0; a < c; a++) {
                if (a < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        /*for (int i = 4; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}













