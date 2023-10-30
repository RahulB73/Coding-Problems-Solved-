// Pattern Problem

// *
// *
// *
// * * * *


import java.util.*;

class Pattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        for(int i=0;i<=row;i++){
            if(i == row){
                for(int j=0;j<row;j++){
                    System.out.print("*" + " ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}