package Ana.lab5;

public class C extends B {
    protected String c;

    public C(String text) {
        super(text);
        this.c = text;
        System.out.println("The constructor is: " + c);

    }
}
