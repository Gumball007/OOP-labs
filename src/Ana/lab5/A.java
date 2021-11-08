package Ana.lab5;

public class A {
    protected String a;
    protected X x = new X("X from A");

    public A(String text, X x) {
        this.a = text;
        System.out.println("The constructor is: " + a);

    }
}
