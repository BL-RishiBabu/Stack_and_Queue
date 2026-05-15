class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack<T> {
    private Node<T> head;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        T poppedData = head.data;
        head = head.next;
        return poppedData;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? "->" : ""));
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackMain {
    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.print("Initial Stack: ");
        stack.display();

        System.out.println("Top element (Peek): " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popping: " + stack.pop());
            System.out.print("Current Stack: ");
            stack.display();
        }
    }
}