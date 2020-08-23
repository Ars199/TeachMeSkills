

public class DomZad2_10 {
    public static void main(String[] args) {
        //Вычислить 1+2+4+8...256.

        /* циклом for each, перебор всех известных элементов в массиве*/

        int array[] = {1, 2, 4, 8, 16, 32, 64, 128, 256};
        int sum = 0;
        for (int element : array)
            sum = sum + element;
        System.out.println(sum);
    }
}






