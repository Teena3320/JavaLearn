public class staticclass {   //outside class not static ever

  static class innerclass{
     String name;

    public innerclass(String name){
      this.name=name;
    }
  }

  // static class innerclass{
  //   static String name;

  //   public innerclass(String name){
  //     innerclass.name=name;
  //   }
  // }


  public static void main(String[] args) {
    innerclass a = new innerclass("teena");
    innerclass b = new innerclass("riya");

    System.out.println(a.name);
    System.out.println(b.name);

  }
}
