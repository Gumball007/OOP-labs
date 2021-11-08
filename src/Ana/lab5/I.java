package Ana.lab5;

public class I extends H {
    protected String i;

    public I(String text) {
        super(text);
        this.i = text;
        System.out.println("The constructor is: " + i);
    }
}
