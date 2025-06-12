import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

  // Method to check if a number is perfect
  public static boolean isPerfectNumber(int number) {
    if (number <= 1) {
      return false;
    }

    int sum = 1; // 1 is always a divisor for numbers > 1

    // Find divisors from 2 to sqrt(number)
    for (int i = 2; i * i <= number; i++) {
      if (number % i == 0) {
        sum += i;
        // Add the corresponding divisor if it's different
        if (i * i != number) {
          sum += number / i;
        }
      }
    }

    return sum == number;
  }

  // Method to get all proper divisors of a number
  public static List<Integer> getProperDivisors(int number) {
    List<Integer> divisors = new ArrayList<>();

    if (number <= 1) {
      return divisors;
    }

    divisors.add(1); // 1 is always a proper divisor

    for (int i = 2; i * i <= number; i++) {
      if (number % i == 0) {
        divisors.add(i);
        if (i * i != number) {
          divisors.add(number / i);
        }
      }
    }

    return divisors;
  }

  // Method to find perfect numbers in a range
  public static void findPerfectNumbersInRange(int start, int end) {
    System.out.println("\nPerfect numbers between " + start + " and " + end + ":");
    boolean found = false;

    for (int i = start; i <= end; i++) {
      if (isPerfectNumber(i)) {
        List<Integer> divisors = getProperDivisors(i);
        System.out.print(i + " is perfect! Divisors: ");

        int sum = 0;
        for (int j = 0; j < divisors.size(); j++) {
          System.out.print(divisors.get(j));
          sum += divisors.get(j);
          if (j < divisors.size() - 1) {
            System.out.print(" + ");
          }
        }
        System.out.println(" = " + sum);
        found = true;
      }
    }

    if (!found) {
      System.out.println("No perfect numbers found in this range.");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== PERFECT NUMBER CHECKER ===");
    System.out.println("A perfect number equals the sum of its proper divisors.");
    System.out.println("Example: 6 = 1 + 2 + 3 (divisors of 6)");
    System.out.println();

    while (true) {
      System.out.println("\nChoose an option:");
      System.out.println("1. Check if a specific number is perfect");
      System.out.println("2. Find perfect numbers in a range");
      System.out.println("3. Show examples of perfect numbers");
      System.out.println("4. Exit");
      System.out.print("Enter your choice (1-4): ");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter a number to check: ");
          int number = scanner.nextInt();

          if (isPerfectNumber(number)) {
            List<Integer> divisors = getProperDivisors(number);
            System.out.print(number + " is a perfect number! ");
            System.out.print("Divisors: ");

            for (int i = 0; i < divisors.size(); i++) {
              System.out.print(divisors.get(i));
              if (i < divisors.size() - 1) {
                System.out.print(" + ");
              }
            }
            System.out.println(" = " + number);
          } else {
            System.out.println(number + " is not a perfect number.");
            List<Integer> divisors = getProperDivisors(number);
            if (!divisors.isEmpty()) {
              int sum = divisors.stream().mapToInt(Integer::intValue).sum();
              System.out.println("Sum of its divisors: " + sum);
            }
          }
          break;

        case 2:
          System.out.print("Enter start of range: ");
          int start = scanner.nextInt();
          System.out.print("Enter end of range: ");
          int end = scanner.nextInt();
          findPerfectNumbersInRange(start, end);
          break;

        case 3:
          System.out.println("\nFirst few perfect numbers:");
          System.out.println("6 = 1 + 2 + 3");
          System.out.println("28 = 1 + 2 + 4 + 7 + 14");
          System.out.println("496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248");
          System.out.println("8128 = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064");
          break;

        case 4:
          System.out.println("Thank you for using Perfect Number Checker!");
          scanner.close();
          return;

        default:
          System.out.println("Invalid choice! Please enter 1-4.");
      }
    }
  }
}
