package linkedlist;

public class SinglyLinkedList {
  private Node head;
  private Node tail;
  private int size;

  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public Node createSinglyLinkedList(int value) {
    Node newNode = new Node(value);
    this.head = newNode;
    this.tail = newNode;
    this.size = 1;

    return head;
  }

  public void insertInSingleLinkedList(int value, int location) {
    Node newNode = new Node(value);

    if (this.head == null) {
      createSinglyLinkedList(value);
      return;
    } else if (location == 0) {
      newNode.next = head;
      head = newNode;
    } else if (location >= size) {
      newNode.next = null;
      tail.next = newNode;
      tail = newNode;
    } else {
      int index = 0;
      Node tempNode = head;

      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }

      Node nextNode = tempNode.next;
      tempNode.next = newNode;
      newNode.next = nextNode;
    }
    size++;
  }

  public void printSinglyLinkedList() {
    if (head == null) {
      System.out.println("No element in the ll to print.");
    } else {
      Node temp = head;

      for (int i = 0; i < size; i++) {
        System.out.print(temp.data);
        if (i != size - 1)
          System.out.print(" -> ");

        temp = temp.next;
      }
    }
    System.out.print("\n");
  }

  public boolean searchNode(int value) {
    if (head != null) {
      Node temp = head;
      for (int i = 0; i < size; i++) {
        if (temp.data == value) {
          System.out.print("linkedlist.Node value found at the location " + i + "\n");
          return true;
        }

        temp = temp.next;
      }
    }

    System.out.println("linkedlist.Node not found!!!");
    return false;
  }

  public void deleteNode(int location) {
    if (head == null) {
      System.out.println("The SLL does not exist");
    } else if (location == 0) {
      head = head.next;
      size--;
      if (size == 0) {
        tail = null;
      }
    } else if (location >= size) {
      Node beforeLast = head;
      for (int i = 0; i < size - 1; i++) {
        beforeLast = beforeLast.next;
      }

      if (beforeLast == head) {
        tail = head = null;
        size--;
        return;
      }

      beforeLast.next = null;
      tail = beforeLast;
      size--;
    } else {
      Node currentNode = head;

      for (int i = 0; i < location - 1; i++) {
        currentNode = currentNode.next;
      }

      Node nextNode = currentNode.next;
      currentNode.next = nextNode.next;
      size--;
    }
  }

  public void deleteSinglyList(){
    head = null;
    tail = null;
    size = 0;
    System.out.println("The SLL deleted successfully");
  }
}
