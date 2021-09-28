package Ana.lab1.task1;

public class Task1 {
    public static void main(String[] args) {

        // First Monitor
        Monitor GigabyteG27Q = new Monitor();
        GigabyteG27Q.dimension = 23;
        GigabyteG27Q.color = "Black";
        GigabyteG27Q.resolution = " 2560 x 1440 ";

        // Second Monitor
        Monitor AcerPredatorX38 = new Monitor();
        AcerPredatorX38.dimension = 37.5;
        AcerPredatorX38.color = "Black";
        AcerPredatorX38.resolution = " 3840 x 1600 ";


        // Compare the 2 Monitors created
        System.out.println("%% Monitor GigabyteG27Q %%");
        GigabyteG27Q.Print();
        System.out.println("%% Monitor AcerPredatorX38 %%");
        AcerPredatorX38.Print();
    }
}
