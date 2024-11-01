import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = scan.nextInt();
        
        long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
        scan.close();
    }
}