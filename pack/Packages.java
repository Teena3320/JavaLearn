package pack;

public class Packages {
  public static void main(String[] args) {
    TestPackages teena= new TestPackages(22,"teen", 12900,false);
    TestPackages riya= new TestPackages(22,"riya", 12900,false);
    System.out.println(TestPackages.population);
    System.out.println(TestPackages.population);

    System.out.println(teena.married);
    System.out.println(riya.married);
    TestPackages.message();

  }
} 
