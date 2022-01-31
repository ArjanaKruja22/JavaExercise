import java.util.Arrays; //arrays contains various methods to manipulate with arrays
 public class Exercise30 {
 public static void main(String[] args)
 {
    int[] array1 = {50, -20, 0};  //declare the array1 which contains 3 elements
	int[] array2 = {5, -50, 10};  //declare the array2 which contains 3 elements
	System.out.println("Array1: "+Arrays.toString(array1));  
	System.out.println("Array2: "+Arrays.toString(array2)); 
    int[] array_new = {array1[0], array2[2]};	
	System.out.println("New Array: "+Arrays.toString(array_new)); 	 
 }
}