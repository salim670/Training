import java.util.Scanner;
public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n =sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m =sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The 2D array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row "+ sum);
        }
        System.out.println("diagonal elements are:");
        for (int  i= 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("boundary elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}