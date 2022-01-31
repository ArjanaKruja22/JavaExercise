import java.util.Scanner;
public class Exercise11_12_13 {
    public static void main(String[] args) throws Exception { 

      Scanner scanner=new Scanner (System.in);

      System.out.println("Enter the first number");
      int a=scanner.nextInt();

      System.out.println("Enter the second number");
      int b=scanner.nextInt();

      System.out.println("Enter the third number");
      int c=scanner.nextInt();

      System.out.println("Average is:" + (a+b+c) / 3);

      double d,e,perimeter,temp;
      d=5.5;
      e=8.5;
      perimeter =2*(a+b);
      System.out.println("Perimeter of rectangular:" +perimeter);

      d=5.5;
      e=8.5;
      System.out.println("Before swapping : d, e = " +d+", "+ + e);
      temp=d;
      d=e;
      e=temp;
      System.out.println("After swapping: d ,e="+d+","+ + e);
    }
}