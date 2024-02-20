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
    /*cll.delete(0);
    cll.delete(1);
    cll.delete(4);
    cll.delete(0);*/
    cll.deleteEntireList();
    cll.traverse();
  }
}
