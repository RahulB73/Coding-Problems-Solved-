// Pascals Traingle

import java.util.*;

class PascalTraingle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print("-");
            }
            
            int number = 1;
            for(int j=0;j<=i;j++){
                System.out.print(number + " ");
                number = number * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}