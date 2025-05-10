package Day4;

public class ConductionLearning {

    public static void main(String[] args) {
        if(false){
            System.out.println("Hello");
        }

        if(false){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
        int age=50;
        if(age<18){
            System.out.println("Not eligible");
            if(age<10){
                System.out.println("child");
            }
        }else if(age>=18||age<=30){// this is or --> ||
            String name="Min Min"; //local variable
            System.out.println("Eligible");
        }else if(age>30||age<=50){
            System.out.println("Not eligible");
        }else{
            System.out.println("Not eligible");
        }



    }
}
