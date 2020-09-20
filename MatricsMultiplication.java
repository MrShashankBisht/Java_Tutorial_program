import java.util.Scanner;
public class MatricsMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the order of first matrics -> ");
        int n1 = sc.nextInt();
        int[][] matrics_1;
        matrics_1 = new int[n1][n1];
        for(int i = 0; i < n1 ;i++ ){
            for(int j=0 ;j < n1 ; j++){
                int tempNum = sc.nextInt();
                matrics_1[i][j] = tempNum ;
            }
        }
        System.out.println("enter the order of second matrics -> ");
        int n2 = sc.nextInt();
        int[][] matrics_2;
        matrics_2 = new int[n2][n2];
        for(int i = 0 ;i < n2 ; i++){
            for(int j = 0 ; j < n2 ; j++){
                int temp2 = sc.nextInt();
                matrics_2[i][j] = temp2;

            }
        }
        
        int[][] matrics_3 ;
        matrics_3 = new int[n1][n2];
        for(int i=0 ; i<n1 ; i++ ){
            for (int k=0 ; k<n2 ; k++){
               int sum = 0;
               for( int j=0 ; j<n2 ; j++ ){
                   sum = matrics_1[i][j] * matrics_2[j][i] + sum;
            
               }
               matrics_3[i][k] = sum ;
               
            }
        }
        
        for(int i =0; i<n1 ;i++){
            for(int k = 0 ;k<n2 ;k++){
                System.out.print(""+matrics_3[i][k]+"  ");
            }
            System.out.println("\n");
        }
        sc.close();
        
    }
    
}
