package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        // 선언
        List<Integer> list1 = new ArrayList<Integer>();

        // 인터페이스 이기떄문에 중간에 클래스를 변경 할 수 있다.
        list1 = new LinkedList<Integer>();

    }
}
