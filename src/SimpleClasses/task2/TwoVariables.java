package SimpleClasses.task2;

//        Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
//        инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class TwoVariables {

    public static void main(String[] args) {

//        Create class example:

        Test2 test2 = new Test2(2, 4);
        System.out.println("First variable is " + test2.firstVariable + ", second variable is " + test2.secondVariable);
    }
}
