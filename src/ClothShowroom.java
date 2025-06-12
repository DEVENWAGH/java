import java.util.Scanner;

public class ClothShowroom {

  // Method to calculate discount percentage based on total cost
  public static int getDiscountPercentage(double totalCost) {
    if (totalCost <= 2000) {
      return 5;
    } else if (totalCost <= 5000) {
      return 10;
    } else if (totalCost <= 10000) {
      return 15;
    } else {
      return 20;
    }
  }

  // Method to determine gift based on total cost
  public static String getGift(double totalCost) {
    if (totalCost <= 2000) {
      return "Calculator";
    } else if (totalCost <= 5000) {
      return "School Bag";
    } else if (totalCost <= 10000) {
      return "Wall Clock";
    } else {
      return "Wrist Watch";
    }
  }

  // Method to calculate discount amount
  public static double calculateDiscountAmount(double totalCost, int discountPercentage) {
    return (totalCost * discountPercentage) / 100.0;
  }

  // Method to calculate final amount after discount
  public static double calculateFinalAmount(double totalCost, double discountAmount) {
    return totalCost - discountAmount;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== CLOTH SHOWROOM FESTIVAL OFFERS ===");
    System.out.print("Enter total cost of purchase (Rs.): ");
    double totalCost = scanner.nextDouble();

    // Calculate discount and gift
    int discountPercentage = getDiscountPercentage(totalCost);
    String gift = getGift(totalCost);
    double discountAmount = calculateDiscountAmount(totalCost, discountPercentage);
    double finalAmount = calculateFinalAmount(totalCost, discountAmount);

    // Display results
    System.out.println("\n=== PURCHASE SUMMARY ===");
    System.out.println("Total Cost: Rs. " + totalCost);
    System.out.println("Discount: " + discountPercentage + "%");
    System.out.println("Discount Amount: Rs. " + discountAmount);
    System.out.println("Final Amount: Rs. " + finalAmount);
    System.out.println("Gift: " + gift);

    System.out.println("\nThank you for shopping with us!");

    scanner.close();
  }
}
