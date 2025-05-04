package Day2;

public class LearningVariable{
  public static void main(String[] args){
    System.out.println("Starting Day 2");

    //version 1
    //person 1
    String name="Min Pyae";
    byte age=25;
    char grade='A';

    //person 2
    String name2="Felix";
    byte age2=25;
    char grade2='A';

    //person 3
    String name3="Felix";
    byte age3=25;
    char grade3='A';

    System.out.println("name="+name+
                       " age="+age+
                       " grade="+grade
                      );
    System.out.println("name3="+name3+
                      " age3="+age3+
                      " grade3="+grade3
                      );
    System.out.println(" name2="+name+
                        " age2="+age+
                        " grade2="+grade
                      );

    //versing 2
    Student student=new Student();
    student.id=6511684;
    student.name="Min Pyae";
    student.age=21;
    student.faculity="Computer Science";
    student.major="CS";

    Student student2=new Student();
    student2.id=6511684;
    student2.name="Min Pyae";
    student2.age=21;
    student2.faculity="Computer Science";
    student2.major="CS";

    Student student3=new Student();
    student3.id=6511684;
    student3.name="Min Pyae";
    student3.age=21;
    student3.faculity="Computer Science";
    student3.major="CS";

    System.out.println("student--->"+student.name+"\n"
                                     +student.age+"\n"
                                     +student.faculity+"\n"
                                     +student.major+"\n"
                                     +student.id+"\n"
                                     );

      System.out.println("student2--->"+student2.name+"\n"
                                      +student2.age+"\n"
                                      +student2.faculity+"\n"
                                      +student2.major+"\n"
                                      +student2.id+"\n"
                                      );

      System.out.println("student3--->"+student3.name+"\n"
      +student3.age+"\n"
      +student3.faculity+"\n"
      +student3.major+"\n"
      +student3.id+"\n"
      );

    


  } 
}