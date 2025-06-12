import java.util.Scanner;

public class VolumeCalculator {
  // Calculate volume of cube
  public static double calculateCubeVolume(double side) {
    return side * side * side;
  }

  // Calculate volume of cuboid
  public static double calculateCuboidVolume(double length, double breadth, double height) {
    return length * breadth * height;
  }

  // Calculate volume of sphere
  public static double calculateSphereVolume(double radius) {
    return (4.0 / 3.0) * 3.14 * radius * radius * radius;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Cube volume calculation
    System.out.print("Enter the side of cube: ");
    double cubeSide = scanner.nextDouble();
    double cubeVolume = calculateCubeVolume(cubeSide);
    System.out.println("Volume of cube: " + cubeVolume);

    // Cuboid volume calculation
    System.out.print("Enter length of cuboid: ");
    double length = scanner.nextDouble();
    System.out.print("Enter breadth of cuboid: ");
    double breadth = scanner.nextDouble();
    System.out.print("Enter height of cuboid: ");
    double height = scanner.nextDouble();
    double cuboidVolume = calculateCuboidVolume(length, breadth, height);
    System.out.println("Volume of cuboid: " + cuboidVolume);

    // Sphere volume calculation
    System.out.print("Enter radius of sphere: ");
    double radius = scanner.nextDouble();
    double sphereVolume = calculateSphereVolume(radius);
    System.out.println("Volume of sphere: " + sphereVolume);

    scanner.close();
  }
}
