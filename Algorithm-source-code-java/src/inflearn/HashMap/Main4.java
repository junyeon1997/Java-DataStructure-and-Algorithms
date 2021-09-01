package inflearn.HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }

    private int solution(int n, int k, int[] arr) {
        int cnt=0;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++) {
                for (int l=j+1; l<n; l++){
                    ts.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        for (Integer t : ts) {
            cnt++;
            if (cnt==k){
                return t;
            }
        }
        return -1;

    }
}
