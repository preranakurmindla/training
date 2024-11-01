import java.util.Scanner;
public class primeNos {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter a number : ");
      int n = scan.nextInt();
      System.out.println("The given number is: " + n);
      int count = 0;
      if(n == 2) {
         System.out.println(n + " is a prime number");
      } else {
         for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
               count++;
            }
         }
         if(count == 2) {
            System.out.println(n + " is a prime number");
         } else {
            System.out.println(n + " is not a prime number");
         }
         scan.close();
      }
   }
}