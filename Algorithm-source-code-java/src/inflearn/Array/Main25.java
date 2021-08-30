package inflearn.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Main25 T = new Main25();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++) {
            arr1[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }
        for (int x : T.solution(n, m, arr1, arr2))
        System.out.print(x + " ");

    }

    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if (arr1[p1]<arr2[p2]){
                answer.add(arr1[p1]);
                p1++;
            }else{
                answer.add(arr2[p2]);
                p2++;
            }
        }
        while (p1<n) answer.add(arr1[p1++]);
        while (p2<m) answer.add(arr2[p2++]);

        return answer;
    }
    public int[] solution2(int n, int m, int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] arr3 = new int[len];
        System.arraycopy(arr1,0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        Arrays.sort(arr3);
        return arr3;
    }
}
