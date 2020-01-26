package SimpleClasses.task1;

public class Test1 {

    int first;
    int second;

    private void output() {

        System.out.println("First value is " + first + ", second value is " + second);
    }

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

    public int sum(int valueOne, int valueTwo) {

        return valueOne + valueTwo;
    }

    public int maxValue(int valueOne, int valueTwo) {

        int max = valueOne;
        if(valueOne < valueTwo) {

            max = valueTwo;
        }
        return max;
    }
}
