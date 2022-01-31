import java.util.Scanner;

public class Exercise22_23_24{

  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a string: ");
  char[]letters = scanner.nextLine().toCharArray();
  System.out.print("Reverse a string: ");

    for (int i = letters.length - 1 ; i >= 0 ; i--){
    System.out.println(letters[i]);
  }
  System.out.print("\n");
}
}
