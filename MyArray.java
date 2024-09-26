import java.util.*;

public class MyArray {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        // // int [] marks = new int[3];// int marks[] = new int[3]; ---> SAME;
        // // marks[0] = 97;
        // // marks[1]= 87;
        // // marks [2]=90;
        // // System.out.println(marks[0]);

        //     // TYPE 2;
        // int marks [] = {97,85,86};
        // for (int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        //      }


        //           // NEW QUESTION;

        // int size = sc.nextInt();

        // int number [] = new int[size];

        // for(int i=0;i<size;i++){
        //     number[i] = sc.nextInt();
        // }


        // for (int i=0;i<size;i++){
        //     System.out.println(number[i]);
        // }


                //NEW QUESTION 2;

        int size = sc.nextInt();

        int number []= new int [size];

        //input;

        for (int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output;

        for (int i =0;i<number.length;i++){ // number.length --> size;
            if(number[i] == x){
                System.out.println("x is found at index :"+" "+i);
            }
        }
          
        


        
    }

    
}
