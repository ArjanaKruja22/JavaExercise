import java.util.Arrays; 
 public class Exercise31 {
 public static void main(String[] args)
 {
    int[] array_nums = {10, 30, 20}; //3 elements on the declared array 
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int max_val = array_nums[0]; //declare the first indexed element because we need to compare
	if(array_nums[2] >= max_val) //compare the second array with the max value int
		max_val = array_nums[2]; 
	System.out.println("Larger value between first and last element: "+max_val); 	 
 }
}
