import java.util.Scanner;

public class Solution {

    public static void isPrime(int n) {
        for (int i = 2; i < 10; i++) {
            if (n == 1) {
                System.out.println(n + " is not a prime number!"); return;
            }
            else if (n % i == 0 && n != i) {
                System.out.println(n + " is not a prime number."); return;
            } else { System.out.println(n + " is a prime number!"); return;}
        }
    }

    public static void main(String[] args) {
        int n = 1;
        Scanner primeInput = new Scanner(System.in);

        while(n!=0) {
            System.out.println("Enter in a number to see if it is prime or press zero to quit.");
            n = primeInput.nextInt();

            isPrime(n);
        }
    }
}
