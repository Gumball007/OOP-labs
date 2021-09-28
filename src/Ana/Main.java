package Ana;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Ana";
        student1.lastName = "Corolețchi";
        student1.printMe();

        Student student2 = new Student();
        student2.firstName = "Cristian";
        student2.lastName = "Ionel";

        Student student3 = new Student();
        System.out.println(student3.firstName);

        Calculator calculator = new Calculator();
        double circleSurface = calculator.getCircleSurface(5);
        System.out.println();

        for (int i = 0; i < 3 ; i++) {
            Student student = new Student();
            student.firstName = "Nume index = " + i;
            student.printMe();

        }
    }
}

class Student {
    String firstName;
    String lastName;

    void printMe() {
        System.out.println("My name is: " + firstName);
        System.out.println("My surname is: " + lastName);
    }
}

class Calculator {
    double Pi = 3.14183242309;

    double getCircleSurface(int radius) {
        return Pi * radius * radius;

    }
}

