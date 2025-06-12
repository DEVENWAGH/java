import java.util.Scanner;

public class PalindromeNum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scanner.nextInt();
      
      if (isPalindrome(num)) {
        System.out.println("It's a palindrome number");
      } else {
        System.out.println("It's not a palindrome number");
      }
    }
  
    private static boolean isPalindrome(int num) {
      // Handle negative numbers
      if (num < 0)
        return false;
      // Single digit numbers are always palindromes
      if (num < 10)
        return true;

      int original = num;
      int reversed = 0;

      while (num > 0) {
        reversed = reversed * 10 + num % 10;
        num /= 10;
      }

      return original == reversed;
    }
}
