public class singleton {//constructor should not be used
  int num=4;
  private singleton(){

  }
  private static singleton instance;
  public static singleton getInstance( ){
    if(instance == null){
      instance= new singleton();
    }
    return instance;
  }
} 
