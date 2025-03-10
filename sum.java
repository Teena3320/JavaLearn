import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    sum();
    System.out.println("Sum of 34 and 556 is: "+sum(34, 556));
  }

  static void sum() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter n1 and n2: ");
    int n1=sc.nextInt();
    int n2=sc.nextInt();

    int sum=n1+n2;
    System.out.println("Sum of "+n1 +" & "+ n2 +": " +sum);
 
  }
  static int sum(int a, int b){
    int sum=a+b;
    return sum; 
  }
}
