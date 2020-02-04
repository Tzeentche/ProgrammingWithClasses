package SimpleClasses.task3;

//        Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
//        (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
//        Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Studentt {

//    Declare global variables

    String name;
    int classNumber;
    int[] achives = new int[5];
    double medium;

//    Create class constructor with initializing variables:

    public Studentt(String name,int classNumber, int[] achives) {

        this.name = name;
        this.classNumber = classNumber;
        this.achives = achives;
    }
}
