package Day4;

public class VariableLearning {
        Sample sampleInstance = new Sample();

    public static void main(String[] args){
        new VariableLearning().testInstanceVal();
        Sample sampleInstance = new Sample();

        //static variable can access from outside with class name
        System.out.println("Sample.total--->"+Sample.total);

        //update value of static variable this value will be changed in the whole system
        Sample.total=100;
        System.out.println("Sample.total--->"+Sample.total);
    }

    public void testInstanceVal(){

        System.out.println(sampleInstance.num1=300);

        int total;
        Sample sampleLocal = new Sample();
        System.out.println(sampleLocal.num1=10);
        System.out.println(sampleLocal.num2=12);

        total = sampleLocal.num1 + sampleLocal.num2;


        System.out.println(total);
        System.out.println(sampleInstance.num1);
    }
    //difference between instance variable, local variable and static variable

    // instance variable store value in heap
    // when object is create it store in heap with specific memory address
    // instance variable can access from outside
    // instance variable alive when the object is created

    // local variable store value in stack
    // when object is create it store in stack
    // local variable cannot access from outside
    // local variable alive when the method is call

    // static variable store value in heap with class scope
    // static variable can access from outside with class name
    // static variable alive when the program is running
    // static method cannot call instance variable


}
