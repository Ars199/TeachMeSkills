

public class DomZad2_8 {
    public static void main(String[] args) {
        //1я трен = 10км. Кажд день +10% нормы предыдущего дня.Сколько за 7 дней

        int day = 0;
        float norma = 10;
        float summPut = 0;

        for (day = 1; day <= 7; day++) {
            summPut = summPut + norma;
            norma = (float) (norma + (norma * 0.1));

            //System.out.println("На " + day + " день" + " он бежит " + summPut + "км.");
        }
        System.out.println("Всего за 7 дней спортсмен пробежал: " + summPut + "км.");
    }
}






