package Ana.lab5;

public class E extends D {
    protected String e;


    public E(String text) {
        super(text);
        this.e = text;
        System.out.println("The constructor is: " + e);
    }
}
