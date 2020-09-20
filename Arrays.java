import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[10];
        /* 
        char[] newChar;
        String[] tempString[]
        */
        System.out.println("enter the marks of the students !");
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i< 10; i++){
            int tempNum = sc.nextInt();
            marks[i] = tempNum;
        }

        System.out.println(" do you want to  print your marks \n if yes then type [Y/y] if no then press any key ");
        char option = sc.next().charAt(0);
        if(option == 'Y' || option == 'y'){
            for(int i = 0; i< marks.length ; i++){
                System.out.print(""+marks[i]+", ");
            }
            
        }
        System.out.println(" Thank u For using this programe");
        sc.close();
    }
    
}
