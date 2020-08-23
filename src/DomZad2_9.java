
public class DomZad2_9 {
    public static void main(String[] args) {
        //Амеба кажд 3ч / на 2 клетки. Сколько амеб будет 3,6,9..24ч.

        /* 1. for( ){  }
        for (int i=1; i<9; i++){  sout()}
        выражение состоит из 3 частей
        1) (int i=1; обьявление счетчика
        2) i < 9; условие – пока true будем заходить в тело цикла
        3) i++) счетчик  */

        int ameba = 1;
        int hours = 24;
        for (int i = 0; i < hours / 3; i++) {   // for (int i = 0; i < x / 3; i++) {
            ameba = ameba * 2;
            System.out.println("Каждые три часа амеб будет: " + ameba);
        }
    }
}






