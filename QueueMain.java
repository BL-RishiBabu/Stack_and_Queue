class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        T dequeuedData = head.data;
        head = head.next;
        
        if (head == null) {
            tail = null;
        }
        return dequeuedData;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? "->" : ""));
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueMain {
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.print("Initial Queue: ");
        queue.display();

        System.out.println("Dequeued element: " + queue.dequeue());
        
        System.out.print("Queue after dequeue: ");
        queue.display();
        
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.print("Queue after second dequeue: ");
        queue.display();
    }
}