package linkedlist;

public class SingleLinkedList <T> {
    // head
    public Node<T> head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;
        public Node(T data){    // 생성자
            this.data = data;
        }
    }

    public void addNode(T data){    // 노드를 추가하는 메서드
        if(head == null){
            head = new Node<T>(data); // 첫 노드일 경우 노드를 하나 만들어서 받은 데이터를 추가해 준다.
        }else{
            Node<T> node = this.head;
            while (node.next!=null){    // 다음 노드가 null이 아니면 다음 노드가 존재 하기 때문에 포인터 주소가 null이 될때까지 연결을 시켜줘야 한다.
                node = node.next;
            }
            node.next = new Node<T>(data);  // node에 next는 addNode를 이용하여 만들어진 새로운 노드를 가르키면 된다.
        }
    }

    public void printNode(){
        if(head != null){   // head가 null이면 데이터를 출력 할 수가 없다.
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
    public Node<T> search(T data){
        if(this.head == null){
            return null;
        }else{
            Node<T> node = this.head;   // head를 출발지점으로 잡고
            while (node !=null) {   // node가 null이 나오기 전까지 즉 마지막 노드 전까지
                if(node.data == data){  // 중간에 넣어야 하는 data를 발견하면
                    return node;       // 해당 노드의 정보를 return
                }else{
                    node = node.next;   // 아니면 다음 노드로 이동
                }
            }
            return null;    // 해당 노드를 전부 스캔하고 같은 데이터가 발견되지 않으면 null 리턴
        }
    }
    public void addNodeInside(T data , T isData){   // data = 새로 들어갈 데이터 / isData = 내가 어떤 데이터 뒤에 넣을것인지
        Node<T> searchNode = this.search(isData);

        if(searchNode == null){ //  해당 값을 search한 값이 존재하지 않을 경우
            this.addNode(data); // 해당 값이 존재하지 않기 때문에 바로 뒤에 data를 넣어주면 된다.
        }else{
            Node<T> nextNode = searchNode.next; // 기존 노드의 next
            searchNode.next = new Node<T>(data);    // 원래 노드의 next를 새로운 노드를 가리키게 만든다 (1번)
            searchNode.next.next = nextNode; // 새로운 노드의 next는 기존 노드의 next로 연결시켜준다.(2번)
        }
    }

    public boolean delNode(T isData){   // Integer = del가 성공하면 1 / 아니면 0을 리턴
        if(this.head == null){  // head에 데이터가 없는 것은 삭제 할 수 있는 데이터가 없기 때문에 false를 리턴
            return false;
        }else{  // 만약 데이터가 있다면 삭제하고 싶은 데이터를 찾기 위해 순회 해야 한다.
            Node<T>node = this.head;
            if(node.data == isData){    // head에 삭제할 데이터가 존재하는 경우
                this.head = this.head.next; //  head를 삭제해야 하기 때문에 head의 위치를 head가 가르키는 다음 노드로 변경
                return true;
            }else{
                while(node.next != null){   // 만약 마지막 노드가 아닌 상태에서
                    if(node.next.data == isData){   // 노드가 가르키는 다음에 data == 삭제하고자 한 데이터 라면
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;   //  만약 데이터가 없다면 다음 노드를 가르키도록
                }
                return false;
            }
        }
    }
}
