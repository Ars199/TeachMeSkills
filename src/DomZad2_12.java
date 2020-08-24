import java.util.Scanner;

public class DomZad2_12 {
    public static void main(String[] args) {
        //Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры

        /* крутой варик через через for + mul
        int a=3;
        int b=4;
        int mul=0;
        for (;b>0;b--,mul+=a);
        System.out.println(mul);
        */

        /*while блок выполняется пока while истинно, однако может "заходить" в цикл, если в условии (incorrect)=false;
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дюймы: ");
        int duim = sc.nextInt();
        double sant = 2.54;

        for (int i = 1; i <= 20; i++) {
            sant = (duim * 2.54);
        }
        System.out.println("Из " + duim + " получится " + sant + " сантиметров.");
    }
}








