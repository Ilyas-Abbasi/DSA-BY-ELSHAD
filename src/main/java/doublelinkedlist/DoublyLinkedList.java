package doublelinkedlist;

public class DoublyLinkedList {
  private DoublyNode head;
  private DoublyNode tail;
  private int size;

  public DoublyNode createDoublyLinkedList(int value) {
    DoublyNode newDoublyNode = new DoublyNode(value);
    newDoublyNode.next = null;
    newDoublyNode.prev = null;
    head = newDoublyNode;
    tail = newDoublyNode;
    size = 1;

    return head;
  }

  public void insert(int value, int location) {
    DoublyNode newNode = new DoublyNode(value);

    if (head == null) {
      createDoublyLinkedList(value);
      return;
    } else if (location == 0) {
      newNode.prev = null;
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    } else if (location >= size) {
      newNode.next = null;
      newNode.prev = tail;
      tail.next = newNode;
      tail = newNode;
    } else {
      DoublyNode temp = head;

      for (int i = 0; i < location - 1; i++) {
        temp = temp.next;
      }

      newNode.next = temp.next;
      newNode.prev = temp;
      temp.next = newNode;
      newNode.next.prev = newNode;
    }
    size++;
  }

  public void traverse() {
    if (head == null) {
      System.out.println("Doubly linked list is empty.");
    } else {
      DoublyNode temp = head;
      for (int i = 0; i < size; i++) {
        System.out.print(temp.value);

        if (i != size - 1) {
          System.out.print("->");
          System.out.print("<-");
        }
        temp = temp.next;
      }
      System.out.print("\n");
    }
  }

  public void reverseTraversal() {
    if (head == null) {
      System.out.println("Doubly linked list is empty.");
    } else {
      DoublyNode temp = tail;

      for (int i = 0; i < size; i++) {
        System.out.print(temp.value);
        if (i != size - 1) {
          System.out.print("->");
          System.out.print("<-");
        }
        temp = temp.prev;
      }
      System.out.print("\n");
    }
  }

  public boolean search(int value) {
    if (head != null) {
      DoublyNode node = head;
      for (int i = 0; i < size; i++) {
        if (node.value == value) {
          System.out.println(value + " found at the index " + i);
          return true;
        }

        node = node.next;
      }
    }

    System.out.println("Element not found in the dll.");
    return false;
  }

  public void delete(int location) {
    if (head == null) {
      System.out.println("Doubly linked list is empty.");
      return;
    } else if (size == 1) {
      head = null;
      tail = null;
    } else if (location == 0) {
      head = head.next;
      head.prev = null;
    } else if (location >= size - 1) {
      tail = tail.prev;
      tail.next = null;
    } else {
      DoublyNode temp = head;

      for (int i = 0; i < location - 1; i++) {
        temp = temp.next;
      }

      temp.next = temp.next.next;
      temp.next.prev = temp;
    }
    size--;
  }

  public void deleteEntireList() {
    DoublyNode temp = head;
    for (int i = 0; i < size; i++) {
      temp.prev = null;
      temp = temp.next;
    }
    head = tail = null;
    size = 0;
    System.out.println("Entire Doubly linked list deleted.");
  }
}
