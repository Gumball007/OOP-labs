package Ana.lab2.task2;

public class Task2 {
    public static void main(String[] args) {

        Queue q1 = new Queue();
        System.out.println("Is queue1 empty? "+q1.Empty());
        q1.push(13);
        q1.push(6);
        q1.push(4);
        System.out.println("Is queue1 empty? "+q1.Full());
        //System.out.println(q1.push(0));
        //System.out.println(q1.push(1));
        System.out.println(q1.pop());

        System.out.println();

        Queue q2 = new Queue(3);
        System.out.println("Is queue2 empty? "+q1.Empty());
        q2.push(1);
        q2.push(12);
        q2.push(7);
        System.out.println("Is queue2 empty? "+q2.Full());
        System.out.println(q2.pop());



    }
}
