package Day7;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=sc.nextLine();
        System.out.println("Your name is "+name);
        System.out.println("How old are you?");

        int age=sc.nextInt();sc.nextLine();

        System.out.println("You are "+age+" years old");
        System.out.println("What is your favorite color?");
        String color=sc.nextLine();
        System.out.println("Your favorite color is "+color);


    }
}
