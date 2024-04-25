package linkedlist;

public class DoubleLinkedList<T> { // 어떤 자료형의 데이터로 LinkedList를 만들지 모르기 때문에 항상 제네릭 문법을 사용한다.
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T>{
        T data;
        Node<T> prev = null;    // 이전 노드를 가리키는 prev
        Node<T> next = null;    // 다음 노드를 가리키는 next

        public Node(T data){
            this.data = data;
        }
    }
    public void addNode(T data){
        if(this.head == null){  // 링크드리스트에 데이터가 없는 경우
            this.head = new Node<T>(data); // head가 가리키는 새로운 노드를 만든다.
            this.tail = this.head; // 맨 처음 노드는 head가 가리키는 노드 = tail이 가리키는 노드가 같다.
        }else{
            Node<T> node = this.head;   // 추가할 마지막 노드를 찾기 위해 head를 가리키는 노드를
            while(node.next!=null){
                node = node.next;
            }
            node.next = new Node<T>(data);  //현재 마지막으로 가리키는 노드의 다음을 새로운 노드를 추가하고.
            node.next.prev = node;  // 다음 노드에 이전에는 기존에 마지막으로 지정했던 노드를 가리키게 한다.
            this.tail = node.next;  // 새로 생긴 노드는 tail이 가리켜야 하기 때문에 다음 노드로 설정
        }
    }

    public void printNode(){
        if(this.head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next!= null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
    public void reversePrintNode(){
        if(this.tail != null){
            Node<T> node = this.tail;
            System.out.println(node.data);
            while(node.prev != null){
                node = node.prev;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData){
        if(this.head == null){  // 데이터가 존재하지 않기 때문에
            return null;
        }else{
            Node<T> node = this.head;
            while (node!=null){ //node가 null이 될때까지 모든 노드를 다 조회하여 같은 데이터를 찾는다.
                if(node.data == isData){
                    return node.data;
                }else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData){
        if(this.head == null){
            return null;
        }else{
            Node<T> node = this.tail;
            while (node != null){
                if(node.data == isData){
                    return node.data;
                }else{
                    node = node.prev;
                }
            }
            return null;
        }
    }

    public boolean insertFront(T existedData , T addData){
        if(this.head == null){
            this.head = new Node<T>(addData);
            this.tail = this.head;
        } else if (this.head.data == existedData) {  // head 노드의 데이터가 existeddata면 head 앞에 addData를 넣고 head가 완전히 바뀐다.
            Node<T> newHead = new Node<T>(addData);
            newHead.next = this.head;
            this.head = newHead;    // head가 바뀌었기 때문에 새로만든 노드를 head가 가리키게 만든다.
            return true;    // 정상적으로 처리 되었기 때문에 true를 리턴
        } else{ // head가 아닌 다른 노드에서 existedData랑 같은 경우
            Node<T> node = this.head;
            while (node!=null){
                if(node.data == existedData){
                    Node<T> nodePrev = node.prev;   //기존에 노드가 가리키는 이전 노드
                    nodePrev.next = new Node<T>(addData);   // 기존에 prev에 next는 새로 만들 노드를 가리키게 한다.
                    nodePrev.next.next = node; // 새로 생긴 노드의 다음을 기존에 exitedData가 존재하는 노드를 가리키게 한다.

                    nodePrev.next.prev = nodePrev; // 새로 생긴 노드에 이전을  기존에 가리키는 이전 노드로 설정한다.
                    node.prev = nodePrev.next;  // 기존 노드에 이전은 새로 생긴 노드로
                    return true;
                }
            }

        }
        return false;
    }
}
