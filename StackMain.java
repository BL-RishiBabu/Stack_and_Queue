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

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
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

// Main class to execute UC 1
public class StackMain {
    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();

        stack.add(70);
        stack.add(30);
        stack.add(56);

        System.out.print("Stack Sequence: ");
        stack.display(); 
    }
}