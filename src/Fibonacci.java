import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter number of terms for Fibonacci sequence: ");
      int n = scanner.nextInt();
      
      if (n <= 0) {
        System.out.println("Please enter a positive number");
        return;
      }
      
      printFibonacciSequence(n);
    }
  }
  
  private static void printFibonacciSequence(int n) {
    int a = 0, b = 1;
    System.out.print("Fibonacci sequence: ");
    
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      int next = a + b;
      a = b;
      b = next;
    }
    System.out.println();
  }
}
