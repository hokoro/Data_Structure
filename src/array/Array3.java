package array;

public class Array3 {
    public static void main(String[] args) {
        // 선언
        Integer[][][] data_list = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7,8,9},
                        {10,11,12}
                }
        };

        System.out.println(data_list[1][0][1]);
        System.out.println(data_list[1][1][0]);
        System.out.println(data_list[0][0][1]);
    }
}
