import java.util.*;

public class Function {

    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;

    // }

    // public static void main(String []args){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name);// here we call the Function;

    // }

        // NEXT QUESTION;

        // public static int calculateSum(int a,int b){
        //     int sum = a+b;  
        //     return sum;
    
        // }
    
        // public static void main(String []args){
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
    
        //     int sum = calculateSum(a,b);

        //     System.out.println("sum of two numbers is :" + sum); // here we call the Function;

    
        // }

            // MULTIPLY TWO NUMBERS AND RETURN THE PRODUCT;

            // public static int multiplyValue(int a,int b){

            //     int multi = a*b;
            //     return multi;
        
            // }
        
            // public static void main(String []args){
            //     Scanner sc = new Scanner(System.in);
            //     int a = sc.nextInt();
            //     int b = sc.nextInt();


        
            //     int multi = multiplyValue(a,b);// here we call the Function;

            //     System.out.println("the multiply of two numbers are : "+ multi);

            //         //System.out.println("the multiply of two values are : "+ multiplyValue(a,b)); // to avoid last two lines;
                
                
            // }

        
                // FACTORIAL OF A NUMBER;

        public static int printFactorial(int a){
            
            int factorial = 1;
            for ( int i=a;i>=1;i--){
                factorial = factorial*i;

            }
            return factorial;

        }

        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            System.out.println("the factorial value is : "+ printFactorial(n));
        }
}
