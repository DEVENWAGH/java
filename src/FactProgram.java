import java.util.Scanner;

public class FactProgram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number to find its factorial: ");
    int num = scanner.nextInt();
    long fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    System.out.println("Factorial of " + num + " is: " + fact);
    scanner.close();
  }
}
