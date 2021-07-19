package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Main13 T = new Main13();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        for(int i=0; i<n-1; i++) {
            if (arr[i]<arr[i+1]) {
                arrayList.add(arr[i+1]);
            }
        }
        return arrayList;

    }
}
