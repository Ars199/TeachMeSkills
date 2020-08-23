

public class DomZad2_11 {
    public static void main(String[] args) {
        //Составьте прогр. вычисляющую A*B, не пользуясь операцией.

        /* крутой варик через через for + mul
        int a=3;
        int b=4;
        int mul=0;
        for (;b>0;b--,mul+=a);
        System.out.println(mul);
        */

        /*while блок выполняется пока while истинно, однако может "заходить" в цикл, если в условии (incorrect)=false;
        */

        int firstInt = 3;
        int secondInt = 4;
        int itter = 0;
        int count = 0;

        while (itter != firstInt) {
            count = count + secondInt;
            itter = itter + 1;

        }
        System.out.println(count);
    }
}








