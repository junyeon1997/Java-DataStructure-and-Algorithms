package programmers;


import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        Main4 T = new Main4();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(T.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        int n = phone_book.length;
        boolean answer = true;
        Arrays.sort(phone_book); //정렬을 통해 for문을 한번만 사용
        for(int i=0; i<n-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])){return false;} //startsWith메소드로 접두어 체크
        }
        return answer;
    }
}
