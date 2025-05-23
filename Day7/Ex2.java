package Day7;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //this is bmi calculator
       System.out.println("Enter your height in cm");
       double height=sc.nextDouble();sc.nextLine();
       System.out.println("Enter your weight in kg");
        double weight=sc.nextDouble();sc.nextLine();
       double bmi=weight/(height*height);
       System.out.println("Your BMI is "+bmi);

       //this is circle calculator
    }
}
