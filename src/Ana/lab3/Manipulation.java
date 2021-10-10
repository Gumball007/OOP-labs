package Ana.lab3;

public class Manipulation {

    static int SentenceCount(String str) {
        int counting1 = 0;
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (((i > 0) && (ch[i] != '.') && (ch[i - 1] == '.')) || ((ch[0] != '.') && (i == 0)))
                counting1++;
        }
        return counting1;
    }

    static int WordCount(String str) {
        int counting2 = 0;
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (i > 0 && (ch[i] != ' ') && (ch[i - 1] == ' ') || i == 0)
                counting2++;
        }
        return counting2;
    }

    static void CharacterCount(String str) {
        int vowels = 0, consonant = 0;
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
                vowels++;
            else if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))
                consonant++;
        }
        System.out.println("The number of vowels in this text are : " + vowels);
        System.out.println("The number of consonants in this text are : " + consonant);
    }

}


