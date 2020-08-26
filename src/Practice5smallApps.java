
public class Practice5smallApps {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x - y;
            //y = y + x;
            //x +=1; y +=1;

            System.out.println(x + "" + y + "");
            x = x + 1;
        }
    }
}










