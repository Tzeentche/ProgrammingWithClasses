package SimpleClasses.task2;

//        Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
//        инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {

//    Declare global variables:

    int firstVariable;
    int secondVariable;

//    Add constructor:

    public Test2() {
    }

//    Add constructor with enter parameters:

    public Test2(int firstVariable, int secondVariable) {

        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;

    }

//    Add set- and get- methods:

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }
}
