/*
- linkedList class -
- So we implemented the datastructure itself at here. 
- I will be explaining all the functions one by one. It will be not do detailed. At videos we will be looking for the functions and their complexity more deeply.  
- For any errors or problems, please mail: samliumay965@gmail.com
*/
public class Queue {
  // Reference variable for the head Node.
  private Node first;

  // Reference variable for the tail Node.
  private Node last;

  // Variable to follow the size of linkedlist.
  private int size;

  // Constructor of the Linkedlist. We will be creating the Linkedlist by creating
  // the first node based on the value itself. Then we will be referencing the
  // head and tail nodes to this first node. Becaouse the first and the last node
  // is same when the size of list is 1. Then we set the size of linkedlist to 1.
  public Queue(int value) {
    Node node = new Node(value);
    first = node;
    last = node;
    size = 1;
  }

  // Setters and getters
  public int getSize() {
    return size;
  }

  public Node getTail() {
    return last;
  }

  public Node getHead() {
    return first;
  }

  // Function to add value at the begining of the list. Complexity is O(1).
  public void enqueue(int value) {

    Node newNode = new Node(value);

    if (size == 0) {
      first = newNode;
      last = newNode;
    } else {
      last.setNext(newNode);
      last = newNode;
    }
    size++;
  }

  // Function to remove the first value of the list. Complexity is O(1).
  public Node dequeue() {

    if (size == 0) {
      return null;
    }
    Node temp = first;
    first = first.getNext();
    temp.setNext(null);
    size--;
    if (size == 0) {
      last = null;
    }
    return temp;

  }

  // Function to print the list in a proper way. Not to relevant.
  public void printQueue() {

    Node temp = first;

    while (temp != null) {

      System.out.print(temp.getValue() + " -> ");

      temp = temp.getNext();
    }
    System.out.print("null \n");
  }

}