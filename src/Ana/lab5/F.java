package Ana.lab5;

public class F extends E {
    protected String f;

    public F(String text) {
        super(text);
        this.f = text;
        System.out.println("The constructor is: " + f);
    }
}
