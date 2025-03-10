import java.util.Scanner;

public class trial {
  public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.print("Enter 1 to check validity: ");

      int exp=input.nextInt();
      switch (exp) {
          case 1 -> System.out.println("Valid input");
          default -> System.out.println("Invalid input");
      }
    }
  } 