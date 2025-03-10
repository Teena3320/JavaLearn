import java.util.ArrayList;
import java.util.Scanner;
 
public class arraylist {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    // ArrayList<Integer> list = new ArrayList<>();
    // System.out.print("Enter 5 numbers: ");
    // for(int i=0; i<5; i++){
    //   list.add(sc.nextInt());
    // }
    // for(int i=0; i<5; i++){
    //   System.out.print(list.get(i)+" ");
    // }

    // System.out.println(list);

    ArrayList<ArrayList<Integer>> list= new ArrayList<>();
    for(int i=0; i<3;i++){
       list.add(new ArrayList<>());
    }
    System.out.print("Enter 9 numbers: ");
    for (int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        list.get(i).add(sc.nextInt());
      }
    }
    System.out.println(list);
  }
}
