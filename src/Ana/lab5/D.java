package Ana.lab5;

public class D extends C{
    protected String d;
    protected X x = new X("X from D");

    public D (String text) {
        super(text);
        this.d = text;
        System.out.println("The constructor is: " + d);

    }
}
