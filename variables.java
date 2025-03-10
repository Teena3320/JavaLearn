import java.util.Arrays;

public class variables {
  public static void main(String[] args) {
    fun(3,4,5,66,2345,66);
  }

  static void fun(int ...q){
    String arr= Arrays.toString(q);
    System.out.println(arr);
  }

}
