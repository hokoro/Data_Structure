package stack;

import java.util.Stack; // 자바가 제공해주는 스택

public class Stack1 {
    public static void main(String[] args) {
        // Last-In and First-Out 구조(LIFO)
        // 한쪽 끝에서만 자료를 넣거나 뺄 수 있는 구조
        // 가장 나중에 쌓은 데이터는 가장 먼저 뺴낼 수 있는 구조
        // 단순한 구조
        // 데이터 개수가 고정적이다. + 저장 공간에 낭비가 발생 할 수 있다.

        // 자바 Stack 선언
        Stack<Integer> stackInt = new Stack<Integer>();

        // 데이터 추가 : push(data)
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);

        // 데이터 삭제 : pop()
        System.out.println(stackInt.pop());
    }
}
