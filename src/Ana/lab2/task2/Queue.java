package Ana.lab2.task2;

public class Queue {

    Node head, tail;
    int size, maxSize;

    // constructor without parameter
    public Queue() {
        head = null;
        tail = null;
        this.maxSize = Integer.MAX_VALUE;
        size = 0;
    }

    // constructor with parameter
    public Queue(int maxSize) {
        head = null;
        tail = null;
        this.maxSize = maxSize;
        size = 0;
    }

    // checking if the object is full
    boolean Full() {
        if (this.maxSize >= 0) {
            return size == maxSize;
        }
        return false;
    }

    // checking if the object is empty
    public boolean Empty() {
        return (size == 0);
    }

    public void push(int value) {
        Node node = new Node(value);
        if (Full()) {
            System.out.println("Queue is full");
            return;
        }
        if (this.tail == null) {
            this.head = this.tail = node;
            size++;
            return;
        }
        this.tail.next = node;
        this.tail = node;
        size++;
    }

    public void pop() {
        if (this.head == null)
            return;
        Node node = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
            size--;
        }
        size--;
    }

}


