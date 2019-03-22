package data.structures;
import java.util.Arrays;
/**
 * @author Steve Rooney
 * Class: Data structures
 * Assignment 5
 * 
 * This is the test method for the Number guessing game and the 
 * Merge sort of the array specified in the assignment prompt.
 * I use a randomFill method created in class to fill the array
 * for the guessing game randomly between 1-100. I use mergeSort
 * to sort the array to be used correctly in the game.
 */
public class assign5Test {
    public static void main(String[] arg){
    int[] ar ={2,8,1,9,4,6,8,10,97,32};
    Merge.mergeSort(ar, 0, ar.length);
    System.out.println("Your sorted arry is: " +
            Arrays.toString(ar));
    
    int[] x = new int[100];
    randomFill.randomFill(x, 1, 100, 100); 
    Merge.mergeSort(x, 0, x.length);
    System.out.println(Assign5.nGuess(x , 1, x.length));
    }
}
