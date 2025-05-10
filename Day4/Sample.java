package Day4;

public class Sample {
    int num1;
    int num2;
    static int total;
    //static method
    public static void getTotal(){
        //static method can not call instance variable
        //num1=10;
        System.out.println("total-->"+total);
    }
    //instance method
    public void display(){
        //instance method can call static variable
        total=0;
        System.out.println("num1-->"+num1);
        System.out.println("num2-->"+num2);
    }

    //Why we cannot call instance variable in method?
    //static method are alive/active when the program is running but
    // instance variable alive when the object is created


}
