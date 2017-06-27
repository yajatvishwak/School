
import java.util.Scanner;
 
public class HappyNumber {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int n = in.nextInt();
     boolean isHappy = isHappyNumber(n);
     if (isHappy) {
         System.out.println(n + " is a happy :-)");
     } else {
         System.out.println(n + " is an unhappy number:-(");
     }

   }
 
 static boolean isHappyNumber(int number) {
       int sq = number;
       do {
         sq = sum(sq);
         if (sq == 1) {
            return true;
         }
       } while (sq != 4);
       return false;
   }
 
   public static int sum(int num) {
       if (num == 0)
           return 0;
       else {
           int t = num % 10;
           return (t * t + sum(num / 10));
       }
   }
}
