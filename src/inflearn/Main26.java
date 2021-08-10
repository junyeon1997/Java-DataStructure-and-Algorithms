package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Main26 T = new Main26();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++) {
            arr1[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++) {
            arr2[i]=sc.nextInt();
        }
        for(Integer k : T.solution(n,m,arr1,arr2)) {
            System.out.print(k + " ");;

        }
    }

    private ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p=0,q=0;
        while(p<n && q<m) {
            if (arr1[p]<arr2[q]){
                p++;
            } else if (arr1[p]>arr2[q]){
                q++;
            }else if (arr1[p]==arr2[q]){
                arr.add(arr1[p]);
                p++;
                q++;
            }
            }
        return arr;
        }
}
