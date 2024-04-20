package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        // queue : FIFO(First in First Out
        // 자바에서도 큐 클래스를 사용할 수 있다.
        // 큐 클래스를 사용하기 위해서는 링크드리스트 클래스를 같이 사용해야 한다.

        //선언
        Queue<Integer> queueInt = new LinkedList<Integer>();
        Queue<String> queueStr = new LinkedList<String>();

        // 데이터 추가 : add(data) or offer(data)
        queueInt.add(1);
        System.out.println(Arrays.toString(queueInt.toArray()));
        boolean result = queueInt.offer(2);
        System.out.println(result); // offer 메서드는 큐에 데이터를 성공적으로 추가할 경우 true 값을 리턴해준다.
        System.out.println(Arrays.toString(queueInt.toArray()));
        System.out.println(queueInt);

        // 데이터 추출 : poll() 큐의 첫번째 값 반환
        System.out.println(queueInt.poll());
        System.out.println(queueInt);
        // 데이터 추출 : remove() 첫 번째 값을 반환하고 큐에서 삭제
        System.out.println(queueInt.poll());
        System.out.println(queueInt);
    }

}
