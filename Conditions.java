import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Grade -> ");
        char grade = sc.next().charAt(0);
        // switch (grade) {
        //     case 'A':
        //     System.out.println("Your grade is very good");
        //     break;
        //     case 'B':
        //     System.out.println("very good ,keep learning");
        //     break;
        //     case 'C':
        //     System.out.println("Nice , keep going");
        //     break;
        //     case 'D':
        //     System.out.println("You have to work hard");
        //     break;
                  
        //     default:
        //     System.out.println("wrong argument");
        //     break;

        // }
        if(grade == 'A'){
            System.out.println("Your grade is very good");
        }else if(grade == 'B'){
            System.out.println("very good ,keep learning");
        }else if(grade =='C'){
            System.out.println("Nice , keep going");
        }else if(grade =='D'){
            System.out.println("You have to work hard");
        }else{
            System.out.println("wrong argument");
        }

        sc.close();
    }
}
 