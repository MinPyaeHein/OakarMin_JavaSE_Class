package Day5.Functions;

public class FunctionsLearning {
    //Why we need to use functions
    //1. code reusability
    //2. encapsulation
    //3. code maintenance


    public static void main(String[] args) {

//        multiplicationTable(5);
//        multiplicationTable(7);
//        multiplicationTable(10);
        String shopping=shopping(6000,"mango, apple, banana");
        System.out.println(shopping);


    }

    public void noArgumentFunction(){
        System.out.print("Your are calling the no argument function");
    }

    public void withArgumentFunction(int num){
        System.out.println("Your are calling the with argument function "+num);
    }

    public void twoArgumentFunction(int num,int num2) {
        System.out.println("Your are calling the two argument function " + num + " " + num2);
    }

    public void threeArgumentFunction(int num,int num2,int num3) {
        System.out.println("Your are calling the three argument function " + num + " " + num2 + " " + num3);
    }

    public int returnFunction(int num){
        System.out.println("Your are calling the return function "+num);
        return num;
    }

    public static String shopping(int money,String shoppingList){
        //shopping process will be
        System.out.println("I am buying those items:: "+shoppingList);
        return shoppingList;
    }

    public static void eating(int money){
        //you can by and eat every where
        System.out.println("Your are eating");
    }

    public static void multiplicationTable(int num){
        System.out.println("Multiplication Table for "+num);
        System.out.println(num+"*1="+num*1);
        System.out.println(num+"*2="+num*2);
        System.out.println(num+"*3="+num*3);
        System.out.println(num+"*4="+num*4);
        System.out.println(num+"*5="+num*5);
        System.out.println(num+"*6="+num*6);
        System.out.println(num+"*7="+num*7);
        System.out.println(num+"*8="+num*8);
        System.out.println(num+"*9="+num*9);

    }

}
