import java.util.*;


public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Hello");
            break;// here we use (case a),(case b) also but just type a,b in the output section for result;
            case 2 : System.out.println("Nomoskar");
            break;// just change the input type;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");
        }
    }
}
