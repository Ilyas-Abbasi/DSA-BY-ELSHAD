package circularlinkedlist;

public class CircularLinkedList {
  private Node head;
  private Node tail;

  private int size;

  public Node createCircularLinkedList(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      newNode.next = newNode;
      head = newNode;
      tail = newNode;
      size = 1;
    }

    return head;
  }

  public void insert(int value, int location) {
    Node newNode = new Node(value);

    if (head == null) {
      createCircularLinkedList(value);
      return;
    } else if (location == 0) {
      newNode.next = head;
      head = newNode;
      tail.next = head;
    } else if (location >= size) {
      newNode.next = tail.next;
      tail.next = newNode;
      tail = newNode;
    } else {
      Node tempNode = head;
      for (int i = 0; i < location - 1; i++) {
        tempNode = tempNode.next;
      }
      newNode.next = tempNode.next;
      tempNode.next = newNode;
    }
    size++;
  }

  public void traverse() {
    if (head == null) {
      System.out.println("No element in csll to print.");
    } else {
      Node temp = head;
      for (int i = 0; i < size; i++) {
        System.out.print(temp.value);

        if (i != size - 1) {
          System.out.print(" -> ");
        }

        temp = temp.next;
      }
      System.out.print("\n");
    }
  }

  public boolean search(int value) {
    if (head != null) {
      Node temp = head;
      for (int i = 0; i < size; i++) {
        if (temp.value == value){
          System.out.println("Element found at the location index " +i);
          return true;
        }
        temp = temp.next;
      }
    }

    System.out.println("Element not found in the csll.");
    return false;
  }
}
