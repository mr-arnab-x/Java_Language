import java.util.*;

public class Pattern {

    //1st PATTERN 
    public static void main(String[] args){
        // for(int i=1;i<=4;i++){
           
        //     for (int j=1;j<=4;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println("*");
            

        // }

            //2ND PATTERN

            //i=n = 4 ; j=m = 5;
       
       
            //outer loop;
        // for(int i=1;i<=4;i++){
        //     //inner loop;
        //     for(int j =1;j<=5;j++) {
        //         //(cell)=>(i,j);
        //         if(i == 1 || j==1 || i==4 ||j==5){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println(" ");

        // }

            //3RD PATTERN
        
        // for(int i=1;i<=4;i++){
            
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
            
        // }

            //4TH PATTERN; (i = i-1) --> (i--)

        //  for(int i=4;i>=1;i--){
            
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println(" ");
            
        // }

            //5TH PATTERN

        // for(int i = 1;i<=4;i++){
        //     // INNER LOOP FOR SPACE;
            
        //     for (int j=1;j<=4-i;j++){
        //         System.out.print(" ");
        //     }
            
        //     // INNER LOOP FOR "*" PRINT;
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }


            // 6TH PATTERN;

        // for(int i = 1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }

            // 7TH PATTERN;

        
        // for(int i = 5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        //  }

            // 8TH PATTERN;

        // int n = 5;
        // int number =1;

        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j =1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;//number = number+1;
        //     }
        //     System.out.println(" ");
        // }

            // 9TH PATTERN;

        int n=5;
            //outer loop;
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j =1;j<=i;j++){
                int sum = i+j;

                if(sum %2 ==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
                
            }
            System.out.println(" ");
        }


        




        
        

        

    }
    
}
