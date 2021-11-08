package Ana.lab5;

public class B extends A{
    protected String b;

    public B(String text) {
        super(text, new X("X from B"));
        this.b = text;
        System.out.println("The constructor is: " + b);

    }
}
