import java.util.Arrays;
import java.util.Scanner;

public class maxindex {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int[] arr = new int[5];
    System.out.println("Enter 5 numbers: ");
    for(int i=0; i<5; i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Max of list is "+ arr[max(arr)]+" at index "+ max(arr));

  }

  static int max(int[] list){
    int temp=0;
    int index=0;

    for(int i=0; i<list.length; i++){
      if(list[i]>temp){
        temp=list[i];
        index=i;
      }
    }
    return index;
    
  }
}
