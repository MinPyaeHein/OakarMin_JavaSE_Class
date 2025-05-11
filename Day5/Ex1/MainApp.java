package Day5.Ex1;
//this system will store student
//step 1 we need to create model/structure/blueprint to store student data
//step 2 we can store data by using the object
public class MainApp {
    public static void main(String[] args){
        Student student=new Student();
        student.id=1;
        student.name="Maung Maung";
        student.address="Dawei";
        student.age=23;
        student.phone="43225235";
        Student.toatalCount+=1;

        Student student1=new Student();
        student1.id=1;
        student1.name="Maung Maung";
        student1.address="Dawei";
        student1.age=23;
        student1.phone="43225235";
        Student.toatalCount+=1;

        Student student2=new Student();
        student2.id=1;
        student2.name="Maung Maung";
        student2.address="Dawei";
        student2.age=23;
        student2.phone="43225235";
        Student.toatalCount+=1;

        Student student3=new Student();
        student3.id=1;
        student3.name="Maung Maung";
        student3.address="Dawei";
        student3.age=23;
        student3.phone="43225235";
        Student.toatalCount+=1;

        //we set total count as a static variable because total count is shared by all object
        System.out.print("total count-->"+student.toatalCount);
    }
}
