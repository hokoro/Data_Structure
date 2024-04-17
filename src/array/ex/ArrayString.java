package array.ex;

public class ArrayString {
    public static void main(String[] args) {
        String []string = {
                "Moms",
                "Monster",
                "Ant",
                "Professional",
                "Company",
                "Manage",
                "Mangement",
                "Cresendo",
                "Cresh",
                "Crush",
                "More",
                "SMash",
                "More And More",
        };
        int answer = 0;
        for(int i = 0; i<string.length; i++){
            if(string[i].indexOf("M") >= 0){    // indexof(char): 문자열에서 해당되는 char의 index를 리턴한다.
                answer++;
            }
        }
        System.out.println(answer);
    }
}
