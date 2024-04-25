package linkedlist;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        doubleLinkedList.addNode(1);
        doubleLinkedList.addNode(2);
        doubleLinkedList.addNode(3);
        doubleLinkedList.addNode(4);
        doubleLinkedList.addNode(5);
//
//        doubleLinkedList.printNode();
//        doubleLinkedList.reversePrintNode();
        System.out.println(doubleLinkedList.searchFromTail(4));
        System.out.println(doubleLinkedList.searchFromHead(2));
        System.out.println(doubleLinkedList.searchFromHead(6));

    }
}
