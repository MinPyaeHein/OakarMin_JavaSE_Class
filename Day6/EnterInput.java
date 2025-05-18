package Day6;

import java.util.Scanner;

public class EnterInput {
    public static void main(String[] args) {
        User user=getUserData();
        user.display();
    }
    public static User getUserData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your phone");
        String phone=sc.nextLine();
        System.out.println("Enter your Email");
        String email=sc.nextLine();
        System.out.println("Enter your Password");
        String password=sc.nextLine();
        System.out.println("Enter your address");
        String address=sc.nextLine();

        User user=new User();
        user.name=name;
        user.phone=phone;
        user.email=email;
        user.password=password;
        user.address=address;

        return user;
    }

}
