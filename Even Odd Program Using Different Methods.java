// Even Odd Program Using Different Methods

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Even Odd Program");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println();
		
// 		boolean n = Approch1();
		if(Approch3(num) == true){
		    System.out.println("Even");
		}
		else{
		    System.out.println("Odd");
		}
	}
	
// 	static boolean Approch1(int num){
// 	    System.out.println("Approch1 - Using if-else");
// 	    if(num % 2 == 0){
// 	        return true;
// 	    }
// 	    else{
// 	        return false;
// 	    }
// 	}
	
// 	static boolean Approch2(int num){
// 	    System.out.println("Approch2 - Without using % Modulor");
// 	    if(num/10 * 2 == num){
// 	        return true;
// 	    }
// 	    else{
// 	        return false;
// 	    }
// 	}
	
	static boolean Approch3(int num){
	   // System.out.println("Using Bitwise & Operator");
	    
	   // if((num & 1) == 0){
	   //     return true;
	   // }
	   // else{
	   //     return false;
	   // }

        // System.out.println("If we use | operator then for even number we get one more than given number and for odd operator it will give same number");
        // System.out.println("Using Bitwise | Operator");
        
        // System.out.println("If we use Ex-Or operator then for even number we get if its greater  than given number  and for odd operator it will give less than the given number number");
        // System.out.println("Using Bitwise | Operator");
        
        
        
    //     if((num | 1) == num+1){
	   //     return true;
	   // }
	   // else{
	   //     return false;
	   // }
	    
	    if((num ^ 1) > num){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
