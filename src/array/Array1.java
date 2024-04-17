package array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        // 배열을 선언할 때 new를 이용한 배열을 미리 선언할 수 있다.
        Integer[] data_list = new Integer[10];
        data_list[0] = 10;
        // 선언 방법 2: 직접 배열에 데이터를 넣어 사용할 수 있다.
        Integer[] data_list1 = {5,4,3,2,1};
        Integer data_list2[] = {1,2,3,4,5};

        System.out.println(data_list[0]);   //  접근할 때는 index를 이용하여 접근이 가능하다.

        // 전체 데이터 배열을 출력할때 Arrays.toString 메서드를 사용하면 된다.
        System.out.println(Arrays.toString(data_list1));

    }
}
