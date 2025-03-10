public class constructors {
  public static void main(String[] args) {
    //Student[] stud= new Student[5];
    // System.out.println(Arrays.toString(stud));
    Student teens= new Student();
    // teens.rollno=56;
    System.out.println(teens.rollno);
    System.out.println(teens.name);
    System.out.println(teens.marks);

    teens.greeting();
    teens.changename("teena");
    teens.greeting();
     
    Student tony = new Student(45,"tony",45.6f);
    System.out.println(tony.rollno);
    System.out.println(tony.name);
    System.out.println(tony.marks);

    Student Tony2 = new Student(tony);
    Tony2.name="Tony Sebastian";
    System.out.println(Tony2.rollno);
    System.out.println(Tony2.name);
    System.out.println(Tony2.marks);

    System.out.println();

//stack item pointing to same item in heap
    Student one=new Student();
    Student two= one;
    one.name="something else now";
    System.out.println(two.name);
  }

  static class Student{
    int rollno;
    String name;
    float marks;


    void greeting(){
      System.out.println("Hello! My name is "+ this.name);
    }

    void changename(String newname){
      this.name= newname;
    }

    // Student(){
    //   this.rollno=500;
    //   this.name="teenaaa";
    //   this.marks=45.6f;
    // }

    Student(){
      this(500,"barry",45.89f);
    }

    Student (int rollno, String name,float marks){
      this.rollno=rollno;
      this.name=name;
      this.marks=marks;
    }

    Student (Student other){
      this.rollno=other.rollno;
      this.name=other.name;
      this.marks=other.marks;
    }
  }
}
