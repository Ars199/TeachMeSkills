
public class Practice3MassiveLength {
    public static void main(String[] args) {
        String[] wordListOne = {"вышеупомянутый", "круглоголичный", "неординарный", "выдающийся"};
        String[] wordListTwo = {"приятный", "позиционированный", "совместный"};
        String[] wordListThree = {"подход", "уровень завоеванного внимания"};

        //Вычисляем сколько слов в каждом массиве
        int OneLenght = wordListOne.length;
        int TwoLenght = wordListTwo.length;
        int ThreeLenght = wordListThree.length;

        //Генерим 3 случ числа
        int rand1 = (int) (Math.random()) * OneLenght;//приведение к целым
        int rand2 = (int) (Math.random()) * TwoLenght;
        int rand3 = (int) (Math.random()) * ThreeLenght;

        //Строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        //Выводим
        System.out.println("Всё, что нам нужно - это " + phrase);

        System.out.println("длина массива 1: " + OneLenght);
        System.out.println("0й индекс массива 1: " + (wordListOne[0]));


    }
}









