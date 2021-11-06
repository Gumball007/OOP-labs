package Ana.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner( new File("/Users/ana/oop-labs/src/Ana/lab4/one_expression.txt"));
        Parentheses someString1 = new Parentheses();
        someString1.text = scanner1.useDelimiter("\\A").next();
        System.out.println(someString1.text + '\n');
        System.out.println(someString1.Balance());
    }
}
