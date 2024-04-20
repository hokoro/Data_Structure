package stack.ex;

import java.util.ArrayList;

public class StackEx<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    // push
    public void push(T item) {stack.add(item);}
    // pop : 항상 ArrayList가 비어 있는지 확인 해야 한다.
    public T pop() {
        if(stack.isEmpty()){
            return null;
        }
        return stack.remove(stack.size()-1);
    }

    public static void main(String[] args) {
        StackEx<Integer> stackInt = new StackEx<Integer>();
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);

        System.out.println(stackInt.pop());
    }
}
