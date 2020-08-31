public class Lesson4_1OOP_main {   // Person

    public static void main(String[] args) {
        Lesson4_OOP p1 = new Lesson4_OOP(21, 22);//   Person p1
        p1.name = "Serg";
        p1.toDo();

        Lesson4_OOP p2 = new Lesson4_OOP(23, 66);//   Person p2
        p2.name = "Sasha";

        Lesson4_OOP p3 = new Lesson4_OOP(88, 90);//   Person p2
        p3.name = "Petya";

        System.out.println("Person 1 with name " + p1.name + " " + p1.age);
        System.out.println("Person 1 with name " + p2.name);
        System.out.println("Person 1 with name " + p3.name);
        System.out.println(p1.toDo());
    }
}




