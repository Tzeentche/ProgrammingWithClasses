package SimpleClasses.task1;

public class Test1 {

//    Declare global variables:

    int first;
    int second;

//      Output method:

    public void output() {

        System.out.println("First value is " + first + ", second value is " + second);
    }

//    Correct methods:

    public void setFirst(int first) {
        this.first = first;
    }

    public int getFirst() {
        return first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

//    Summ finder method:

    public int sum(int valueOne, int valueTwo) {

        return valueOne + valueTwo;
    }

//    Max value finder method:
    
    public int maxValue(int valueOne, int valueTwo) {

        int max = valueOne;
        if(valueOne < valueTwo) {

            max = valueTwo;
        }
        return max;
    }
}
