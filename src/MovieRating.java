import java.util.Scanner;

public class MovieRating {
  public static String evaluateRating(double rating) {
    if (rating >= 4.0 && rating <= 5.0) {
      return "Good";
    } else if (rating >= 3.0 && rating < 4.0) {
      return "Average";
    } else if (rating < 3.0) {
      return "Bad";
    } else {
      return "Invalid rating";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter movie rating (0.0-5.0): ");
    double rating = scanner.nextDouble();

    String evaluation = evaluateRating(rating);
    System.out.println("Movie Rating: " + rating);
    System.out.println("Evaluation: " + evaluation);

    scanner.close();
  }
}
