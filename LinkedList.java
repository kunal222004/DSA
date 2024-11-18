public class LinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println(data + " added to the list.");
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == data) {
            head = head.next;
            System.out.println(data + " deleted from the list.");
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println(data + " not found in the list.");
        } else {
            current.next = current.next.next;
            System.out.println(data + " deleted from the list.");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        System.out.print("List elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        list.delete(20);
        list.display();
        list.delete(40);
        list.display();
    }
}
