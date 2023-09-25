// Leap year or not 
// Number of leap years in  

import java.util.Scanner;

class LeapYear{
    
    // Leap Year logic
    static boolean isLeapYear(int year){
        if(year%400 == 0){
            return true;
        }
        else if(year%4== 0 && year%100 != 0){
            return true;
        }
        return false;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = sc.nextInt();
        
        boolean result = isLeapYear(year);
        
        if(result){
            System.out.println("Given year is a leap year");
        }
        else{
            System.out.println("Given year is not a leap year");
        }
        
        System.out.print("Enter the year range : ");
        int startYear = sc.nextInt();
        int endYear = sc.nextInt();
        
        
        System.out.print("The leap years betwenn " + startYear + " to " + endYear + " are : ");
        for(int i=startYear; i<=endYear; i++){
            boolean r = isLeapYear(i);
            if(r){
                System.out.print(i + " ");
            }
        }
    }
}