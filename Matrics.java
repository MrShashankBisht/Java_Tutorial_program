/* 
this is a simple matrics programe of NxN

*/
import java.util.Scanner;

public class Matrics {
    static int[][] matrics_1;

    public static void main(String[] args) {
        System.out.println("Enter the order of square of Matrics !!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        matrics_1 = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j= 0;j < n ; j++){
                int tempNum = sc.nextInt();
                matrics_1[i][j] = tempNum;
            }
        }

        for(int i =0; i<n ;i++){
            for(int j = 0 ;j<n ;j++){
                System.out.print(""+matrics_1[i][j]+"  ");
            }
            System.out.println("\n");
        }
        sc.close();
    }

}
