import java.util.*;

public class Gretter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b ){
            System.out.println("a is gretter");
        }
        else if(b>c){
            System.out.println("b is gretter");
        }
        else{
            System.out.println("c is gretter");
        }


    }
    
}
