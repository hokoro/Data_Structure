package linkedlist;

public class NodeMain {
    public static void main(String[] args) {

        // 선언
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        // 포인터 가르키기
        node1.next = node2;
        Node<Integer> head = node1;
    }
}
