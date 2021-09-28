package Ana.lab1.task2;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student("Ana", 20, 9);
        Student student2 = new Student("Cristian", 19,10);
        Student student3 = new Student("Viorel", 21, 7);
        Student student4 = new Student("Iurie", 20, 10);
        Student student5 = new Student("Nicoleta", 20, 10);
        Student student6 = new Student("Alexandru", 21, 8);
        Student student7 = new Student("Andreea", 19, 9);
        Student student8 = new Student("Mihai", 20, 10);
        Student student9 = new Student("Cezar", 21, 7);

        University university1 = new University();
        university1.name = "UTM";
        university1.foundationYear = "1980";
        university1.students = new Student[]{student1, student2, student3};

        University university2 = new University();
        university1.name = "USM";
        university1.foundationYear = "1978";
        university1.students = new Student[]{student4, student5, student6};

        University university3 = new University();
        university1.name = "USMF";
        university1.foundationYear = "1945";
        university1.students = new Student[]{student7, student8, student9};

        University[] universities ={university1, university2, university3};

        double universityMean() {
            double mean1 = 0;
            for (University universities1 : universities) {
                mean1 += universities1.averageMark();
            }
            return mean1 / universities.length;
        }

    }
}
