package Ana.lab3;

import static Ana.lab3.Manipulation.*;

public class Main {
    public static void main(String[] args) {
        String string = "Object-oriented programming is a programming paradigm based on the concept of objects. Is about creating objects that contain both data and functions.";
        System.out.println(string + "\n\n" + "The number of sentences in this text are : " + SentenceCount(string));
        System.out.println("The number of words in this text are : " + WordCount(string));
        System.out.println("The number of letters in this text are : " + string.length());
        CharacterCount(string);
        LongestWord(string);
    }
}

