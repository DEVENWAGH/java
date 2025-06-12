import java.util.Scanner;

public class VotingEligibility {

  // Method to check voting eligibility
  public static String checkVotingEligibility(int age) {
    if (age >= 18) {
      return "You are eligible to vote!";
    } else {
      return "You are not eligible to vote yet. You need to be at least 18 years old.";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== VOTING ELIGIBILITY CHECKER ===");
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    String result = checkVotingEligibility(age);
    System.out.println(result);

    if (age >= 18) {
      System.out.println("Congratulations! Make sure to exercise your right to vote.");
    } else {
      int yearsLeft = 18 - age;
      System.out.println("You will be eligible to vote in " + yearsLeft + " year(s).");
    }

    scanner.close();
  }
}
