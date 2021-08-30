package inflearn.Array;

import java.util.Scanner;

public class Main22 {

    int[] dx={-1,0,1,0};
    int[] dy={0,1,0,-1};

    public static void main(String[] args) {
        Main22 T = new Main22();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr =new int[n+2][n+2];
        for (int i=1; i<n+1; i++){
            for (int j=1; j<n+1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));

    }

    public int solution(int n, int[][] arr) {
        int cnt=0;
        for (int i=1; i<n+1; i++) {
            for (int j = 1; j < n + 1; j++) {
                boolean check = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (arr[nx][ny] >= arr[i][j]) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public int solution2(int n, int[][] arr) {
        int cnt=0;
        for (int i=1; i<n+1; i++){
            for (int j=1; j<n+1; j++){
                if (arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1] && arr[i][j]>arr[i][j-1]){
                    cnt++;
                }
            }
        }
        return cnt;
    }

}

