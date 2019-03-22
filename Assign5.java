package data.structures;
import java.util.Scanner;
/**
 * @author Steve Rooney
 * Class: Data structures
 * Assignment 5
 * 
 * In this class I define how to use binary search to determine the 
 * number that a person is thinking of in as few steps as possible. 
 * In the first if statement I use count and 0 as a starting flag 
 * to only show the questions on the first iteration of the recursive
 * function. If the user inputs no then it is assumed the number is 
 * in the lower half of the initial array. If the user inputs yes,
 * than it is assumed the users number is in the large half of 
 * the initial array.
 */
public class Assign5 {
    public static int nGuess(int[] ar, int begin, int end){
        Scanner in = new Scanner(System.in);
        int mid = (begin + end) /2;
        int tar = ar[mid];
        int count =0;
        count++;
        if(count == 0){
            System.out.println("Please think of a number between " +
                    begin +" and "+end);
            
            count++;
        }
        
        System.out.println("Is your number bigger than " + tar);
        String s = in.next();
        
    if(begin == end){
        System.out.println("You'r number is: ");
        return tar;
    }
        
    if( "no".equals(s))
        return nGuess(ar, begin, mid);
    
    return nGuess(ar, mid+1, end);
    
    }
}

