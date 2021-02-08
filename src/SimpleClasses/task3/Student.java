package SimpleClasses.task3;

//        Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
//        (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
//        Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {

    private static Studentt[] study;

    public static void main(String[] args) {

//        Create example of array and fillit with dates:

        study = new Studentt[]{
                new Studentt("Burak", 3, new int[]{9, 8, 10, 9, 10}),
                new Studentt("Ryabovolov", 4, new int[]{9, 8, 10, 9, 10}),
                new Studentt("Golubnichiy", 3, new int[]{9, 9, 10, 9, 10}),
                new Studentt("Yarmalowich", 3, new int[]{9, 8, 9, 9, 10}),
                new Studentt("Romanov", 2, new int[]{9, 8, 10, 9, 10}),
                new Studentt("Bareisha", 4, new int[]{10, 10, 10, 10, 10}),
                new Studentt("Drebezova", 4, new int[]{9, 9, 9, 9, 8}),
                new Studentt("Bobcov", 3, new int[]{9, 10, 8, 9, 10}),
                new Studentt("Simonenkova", 2, new int[]{9, 8, 9, 9, 10}),
                new Studentt("Belskaya", 4, new int[]{7, 8, 8, 9, 10})
        };

    }

    public void outputDates(Studentt[] study) {

        for(int i = 0; i < study.length; i++) {

            int[] arrays = new int[5];

            if ()
        }
    }
}
