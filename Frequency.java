// Cheacking the Frequency of characters in string

import java.util.*;

class Frequency{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int[] freq = new int[256];
        
        for(int i=0; i<str.length();i++){
            char currentChar = str.charAt(i);
            int asciiVal = (int) currentChar;
            freq[asciiVal]++;
        }
        
        for(int i=0;i<=255;i++){
            if(freq[i] > 0){
                char current = (char) i;
                System.out.println(current + " " + freq[i]);
            }
        }
    }
}