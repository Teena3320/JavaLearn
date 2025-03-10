public class singletonmain {
  public static void main(String[] args) {
    // singleton obj=new singleton();
    // obj.num=90;
    // System.out.println(obj.num);

    singleton obj= singleton.getInstance();
    singleton obj2= singleton.getInstance();
    singleton obj3= singleton.getInstance();//all point to same instance/obj



  }
}
