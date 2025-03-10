import java.util.Arrays;
import java.util.Scanner;

public class arrays {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter length of array: ");
    int n=sc.nextInt();
    // int[] arr= new int[n];
    // System.out.println(arr[0]);
    // for(int i=0; i<arr.length; i++){
    //   arr[i]=sc.nextInt();
    //   System.out.print(arr[i]+" ");
    // }
    // for(int num:arr){
    //   System.out.print(num +" ");
    // }
    // System.out.println(Arrays.toString(arr));


    int[][] arr= new int[n][n];
      for (int[] arr1 : arr) {
          for (int j = 0; j < arr1.length; j++) {
              arr1[j] = sc.nextInt();
          }
      }
      for (int[] arr1 : arr) {
          for (int j = 0; j < arr1.length; j++) {
              System.out.print(arr1[j] + " ");
          }
          System.out.println();
      }
  
      for (int[] arr1 : arr) {
          System.out.println(Arrays.toString(arr1));
      }
}
}

