import java.util.*;

public class TwoDarray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int [][] number = new int [row][cols];

            //input;

            //row;
        for(int i=0;i<row;i++){
            //columns;
            for(int j=0;j<cols;j++){
                number [i][j]=sc.nextInt();

            }
        }

            //output;

                  //row;
                  for(int i=0;i<row;i++){
                    //columns;
                    for(int j=0;j<cols;j++){
                        System.out.print(number[i][j]+" ");
        
                    }
                    System.out.println(" ");
                }
    }
    
}
