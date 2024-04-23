package linkedlist;

public class Node <T>{
    T data; //  데이터
    Node<T> next = null; //  다음 노드를 가리키는 주소 (다음 노드 생성 전까지는 null을 유지해야 한다.)

    public Node(T data){
        this.data = data;   //
    }
}
