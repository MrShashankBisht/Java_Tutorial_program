import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
// this is test 1
        // System.out.println("Enter the number..");
        // int num=sc.nextInt();
        // System.out.println("input number is -> "+num);

// this is test 2 

        // System.out.println("enter first number = ");
        // int num1 = sc.nextInt();
        // System.out.println("enter second number = ");
        // int num2 = sc.nextInt();
        // int num3 = num1+num2 ;
        // System.out.println("result = "+num3);

// this is test 3
        // System.out.println("enter your number = ");
        // int num = sc.nextInt();
        // int num1 = num % 2;
        // if (num1 == 0){
        //     System.out.println("this is an even number");  
        // }else{ 
        //     System.out.println("this is an odd number");
        // }
// this is test 4
            System.out.println("enter any number whose table you want =");
            int num =sc.nextInt();
            for(int i=1;  i<11; i++){
                int num1= num*i;
                System.out.println(num+" * "+i+ " = " + num1 );
            }
        sc.close();
    }
}