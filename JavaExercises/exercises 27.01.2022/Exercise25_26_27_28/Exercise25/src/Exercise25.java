import java.util.Scanner; //import the Scanner class
 public class Exercise25 {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in); //create scanner object
     System.out.print("Input a String: ");
	 String line = in.nextLine(); //read user input
	 line = line.toLowerCase();
	 System.out.println(line); 
	 }			
}
