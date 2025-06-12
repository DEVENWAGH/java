import java.util.Scanner;

public class App {
    // Method to calculate area of triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate area of rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get triangle dimensions from user
        System.out.print("Enter triangle base: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter triangle height: ");
        double triangleHeight = scanner.nextDouble();
        
        double triangleArea = calculateTriangleArea(triangleBase, triangleHeight);
        System.out.println("Area of triangle with base " + triangleBase + " and height " + triangleHeight + " is: " + triangleArea);

        // Get rectangle dimensions from user
        System.out.print("Enter rectangle length: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter rectangle width: ");
        double rectangleWidth = scanner.nextDouble();
        
        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of rectangle with length " + rectangleLength + " and width " + rectangleWidth + " is: " + rectangleArea);

        scanner.close();
    }
}
