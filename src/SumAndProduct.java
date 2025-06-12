public class SumAndProduct {

  public static void main(String[] args) {
    int sum = 0;
    long product = 1;

    System.out.println("Numbers from 1 to 10:");

    for (int i = 1; i <= 10; i++) {
      sum += i;
      product *= i;
      System.out.print(i + " ");
    }

    System.out.println("\n");
    System.out.println("Sum of numbers from 1 to 10: " + sum);
    System.out.println("Product of numbers from 1 to 10: " + product);
  }
}
