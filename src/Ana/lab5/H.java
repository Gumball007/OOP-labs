package Ana.lab5;

public class H extends F{
    protected String h;
    private X x = new X("X from H");

    public H(String text) {
        super(text);
        this.h = text;
        System.out.println("The constructor is: " + h);
    }
}
