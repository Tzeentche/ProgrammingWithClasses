package SimpleClasses.task2;

//        Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
//        инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {

    int firstVariable;
    int secondVariable;

    public Test2() {
    }

    public Test2(int firstVariable, int secondVariable) {

        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;

    }

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
