public class stringBuilder {
  public static void main(String[] args) {
    // String a ="Kunal";
    // String b = "Kunal";
    // System.out.println(a==b);

    // String aa = new String("Kunal");
    // String bb = new String("Kunal");
    // System.out.println(aa==bb);
    // System.out.println(aa.equals(bb));

    StringBuilder builder = new StringBuilder();

    for(int i =0; i<26; i++){
      char ch = (char)('a' + i);
      builder.append(ch);
    }

    System.out.println(builder);
    System.out.println(builder.reverse());
 
  }
}
