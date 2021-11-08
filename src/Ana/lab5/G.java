package Ana.lab5;

public class G extends F{
    protected String g;

    public G(String text) {
        super(text);
        this.g = text;
        System.out.println("The constructor is: " + g);
    }
}

