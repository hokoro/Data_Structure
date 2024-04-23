package linkedlist;

public class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList<Integer>MyLinkedList = new SingleLinkedList<Integer>();

//        for(int i = 1;i <= 10; i++){
//            MyLinkedList.addNode(i);
//        }
//        MyLinkedList.printNode();
//        MyLinkedList.addNode(1);
//        MyLinkedList.addNode(2);
//        MyLinkedList.addNode(3);
//        MyLinkedList.addNode(5);
//        MyLinkedList.addNode(6);
//
//        MyLinkedList.addNodeInside(4 , 3);
//
//        MyLinkedList.printNode();
//        // 없는 데이터 넣어보기
//        MyLinkedList.addNodeInside(7,8);
//        MyLinkedList.printNode();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);

        // head 데이터 삭제
        MyLinkedList.delNode(1);
        MyLinkedList.printNode();
        // 중간 데이터 삭제
        MyLinkedList.delNode(3);
        MyLinkedList.printNode();
        // 마지막 데이터 삭제
        MyLinkedList.delNode(5);
        MyLinkedList.printNode();

        //없는 데이터 삭제
        System.out.println(MyLinkedList.delNode(20));
    }
}
