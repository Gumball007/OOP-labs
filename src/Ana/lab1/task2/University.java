package Ana.lab1.task2;

public class University {
    String name;
    String foundationYear;
    Student[] students;

    double averageMark(){
        double mean = 0;
        for (Student student:students){
            mean += student.mark;
        }
        return mean / students.length;
    }

}
