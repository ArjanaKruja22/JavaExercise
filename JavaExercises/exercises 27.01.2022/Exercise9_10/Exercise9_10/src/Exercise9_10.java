import java.util.Scanner;

public class Exercise9_10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=10;++i)
        {

            System.out.printf("%d * %d = %d \n",num, i,num*i);
        }
        System.out.println("Choose your circle R");
        int r =scanner.nextInt();
        double circleperimeter = pi* r*r;
        System.out.println(circleperimeter);
        double circlearea = pi*pi*r;
        System.out.println(circlearea);
        
    }
}
