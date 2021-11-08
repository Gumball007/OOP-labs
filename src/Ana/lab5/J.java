package Ana.lab5;

public class J extends I{
    protected String j;

    public J(String text) {
        super(text);
        this.j = text;
        System.out.println("The constructor is: " + j);
    }
    public static void main(String[] args) {
        A classA = new A("from A", new X("from X"));
        B classB = new B("from B");
        C classC = new C("from C");
        D classD = new D("from D");
        E classE = new E("from E");
        F classF = new F("from F");
        G classG = new G("from G");
        H classH = new H("from H");
        I classI = new I("from I");
        J classJ = new J("from J");
    }
}
