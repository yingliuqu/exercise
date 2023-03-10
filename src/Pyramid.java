import java.util.Arrays;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        yanghui y = new yanghui();
        y.jisuan();
    }
}

class yanghui {
    //杨辉三角方法
    public void jisuan() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[][] = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}