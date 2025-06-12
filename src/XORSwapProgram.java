import java.util.Scanner;

public class XORSwapProgram {

  public static void swapUsingXOR(int a, int b) {
    System.out.println("Before swap: a = " + a + ", b = " + b);

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("After swap: a = " + a + ", b = " + b);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    swapUsingXOR(num1, num2);

    scanner.close();
  }
}
