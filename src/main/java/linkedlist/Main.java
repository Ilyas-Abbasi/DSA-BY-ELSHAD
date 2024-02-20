package linkedlist;

public class Main {
  public static void main(String[] args) {
    SinglyLinkedList singlyLinkedList=new SinglyLinkedList();

    //Adding to the empty list
    singlyLinkedList.createSinglyLinkedList(2);
    //singlyLinkedList.printSinglyLinkedList();

    //Adding in the starting of the list
    singlyLinkedList.insertInSingleLinkedList(1, 0);
    //singlyLinkedList.printSinglyLinkedList();

    //Adding in the end of the list
    singlyLinkedList.insertInSingleLinkedList(4, 3);
    //singlyLinkedList.printSinglyLinkedList();

    //Adding in the end of the list
    singlyLinkedList.insertInSingleLinkedList(3, 2);
    singlyLinkedList.printSinglyLinkedList();

    boolean isNodeFound = singlyLinkedList.searchNode(3);
    System.out.println(isNodeFound);

    singlyLinkedList.deleteNode(2);
    singlyLinkedList.printSinglyLinkedList();
    singlyLinkedList.deleteSinglyList();
    singlyLinkedList.printSinglyLinkedList();
  }
}
