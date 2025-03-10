import java.util.Scanner;

public class greeting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String personalized = greet(sc.nextLine());
    System.out.println(personalized);
  }

  static String greet(String name){
    String message ="Hello " + name;
    return message;
  }
}
