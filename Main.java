//Bradley Dufour
//2016-01-28
//Practice 2011 - 04: Arithmetic and Geometric Sums
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      do
      {
         int first = scan.nextInt();
         int second = scan.nextInt();
         int third = scan.nextInt();
         boolean arithmetic = false;
         if((third - second) == (second - first))
            arithmetic = true;
         int sum = 0;
         if(n == 1)
            sum += first;
         else if(n == 2)
            sum += first + second;
         else if(n == 3)
            sum += first + second + third;
         else if(arithmetic)
         {
            sum += first + second + third;
            int change = second - first;
            int next = third;
            for(int i = 3; i < n; i++)
            {
               next += change;
               sum += next; 
            }
         }
         //If geometric
         else
         {
            sum += first + second + third;
            int change = second / first;
            int next = third;
            for(int i = 3; i < n; i++)
            {
               next *= change;
               sum += next;
            }
         }
         System.out.println(sum);
         n = scan.nextInt();
      }
      while(n != 0);
      System.exit(0);
   }
}
