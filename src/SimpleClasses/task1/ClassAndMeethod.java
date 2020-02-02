package SimpleClasses.task1;

//        Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
//        Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее
//        значение из этих двух переменных.

public class ClassAndMeethod {

    public static void main(String[] args) {

//        Start methods to work:
        
        Test1 test1  = new Test1();
        test1.setFirst(3);
        test1.setSecond(4);
        System.out.println(test1.sum(1, 7));
        System.out.println(test1.maxValue(3,2));
        test1.output();
    }
}
