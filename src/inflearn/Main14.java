package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Main14 T = new Main14();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n];
        for(int i=0; i<n; i++) {
            student[i]= sc.nextInt();
        }

        System.out.println(T.solution2(n, student));
    }
    //첫번째 풀이 ArrayList 사용
    public int solution(int n, int[] student) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(student[0]);
        for (int x : student) {
            if(arr.get(arr.size() - 1) <x) {
                arr.add(x);
            }
        }
        return arr.size();
    }
    //두번째 풀이
    public int solution2(int n, int[] student) {
        int answer=1, max=student[0];
        for(int i=1; i<n; i++) {
            if(student[i]>max) {
                answer++;
                max=student[i];
            }
        }
        return answer;
    }

}
