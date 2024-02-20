package circularlinkedlist;

public class Main {
  public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();

    cll.createCircularLinkedList(1);
    cll.insert(0, 0);
    cll.insert(2, 2);
    cll.insert(3, 3);

    cll.traverse();
    cll.search(4);
  }
}
