package pack;
public class TestPackages {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    static void message(){
      System.out.println("hello world");
    }

    public TestPackages(int age, String name, int salary, boolean married){
      this.age=age;
      this.name=name;
      this.salary=salary;
      this.married=married;
      TestPackages.population+=1;
    }
  } 