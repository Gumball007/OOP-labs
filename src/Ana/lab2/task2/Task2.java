package Ana.lab2.task2;

public class Task2 {
    public static void main(String[] args) {

        Queue q1 = new Queue(3);
        System.out.println("Is queue empty? "+q1.Empty());
        q1.push(23);
        q1.push(12);
        q1.push(16);
        System.out.println(q1.head.value);
        System.out.println(q1.head.next.value);
        System.out.println(q1.head.next.next.value);
        System.out.println("Is queue empty? "+q1.Empty() + "\n");
        q1.pop();
        System.out.println("Now the head value is: " +q1.head.value);
    }
}
