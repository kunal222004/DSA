import java.util.LinkedList;

public class Queue {
    // LinkedList to store queue elements
    private LinkedList<Integer> queue;

    // Constructor to initialize the queue
    public Queue() {
        queue = new LinkedList<>();
    }

    // Enqueue operation (add element to the rear of the queue)
    public void enqueue(int item) {
        queue.addLast(item);
        System.out.println(item + " added to the queue.");
    }

    // Dequeue operation (remove element from the front of the queue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; // Return -1 if queue is empty
        }
        int item = queue.removeFirst();
        System.out.println(item + " removed from the queue.");
        return item;
    }

    // Peek operation (view the front element without removing it)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return queue.size();
    }

    // Display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue elements: " + queue);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        
        // Enqueue operations
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        // Display queue
        q.display();
        
        // Dequeue operation
        q.dequeue();
        
        // Display queue
        q.display();
        
        // Peek operation
        System.out.println("Front of the queue: " + q.peek());
        
        // Size of the queue
        System.out.println("Size of the queue: " + q.size());
        
        // Checking if queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());
    }
}
