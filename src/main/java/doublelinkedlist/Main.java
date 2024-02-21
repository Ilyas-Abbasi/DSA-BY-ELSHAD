package doublelinkedlist;

public class Main {
  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.createDoublyLinkedList(2);
    dll.insert(1, 0);
    dll.insert(3, 2);
    dll.insert(5, 4);
    dll.insert(4, 3);
    dll.traverse();
    dll.reverseTraversal();
    //dll.search(7);
    dll.delete(4);
    dll.traverse();
    dll.deleteEntireList();
    dll.traverse();
  }
}
