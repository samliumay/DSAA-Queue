public class Main {
  public static void main(String[] args) {

    System.out.println("Testing our queue data.");
    System.out.println("Creating queue.");
    Queue queue = new Queue(1);
    System.out.println("Printing queue.");
    queue.printQueue();
    System.out.println("");

    System.out.println("Testing our enqueue function.");
    System.out.println("enqueue 2.");
    queue.enqueue(2);
    System.out.println("Printing queue.");
    queue.printQueue();
    System.out.println("");

    System.out.println("Testing our dequeue function.");
    System.out.println("dequeue.");
    queue.dequeue();
    System.out.println("Printing queue.");
    queue.printQueue();
    System.out.println("");

  }

}