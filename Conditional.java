// import java.util.*;

// public class Conditional {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age >= 18){
//             System.out.println("Audult");

//         }
//         else{
//             System.out.println("not Audult");
//         }

//     }
    
// }

// if,else-if,else
import java.util.*;
public class Conditional {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        if(age >= 18 && age <=90){
            System.out.println("You are  able to vote");
        }
        else if(age >90){
            System.out.println("You are able to vote,online");
        }
        else{
            System.out.println("please, vote when you are in proper age");
        }
    }
}