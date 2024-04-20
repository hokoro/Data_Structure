package queue.ex;

import java.util.ArrayList;

public class MyQueue<T> {   // T : Type 자료형
    private ArrayList<T> queue = new ArrayList<T>();
    public void enqueue(T item){
        queue.add(item);
    }
    public T dequeue(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue<Integer> queueInt = new MyQueue<Integer>();
        queueInt.enqueue(1);
        System.out.println(queueInt.dequeue());
        System.out.println(queueInt.dequeue());

    }
}
