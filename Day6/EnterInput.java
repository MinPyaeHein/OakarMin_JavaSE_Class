package Day6;

import java.util.Scanner;

public class EnterInput {
    public static void main(String[] args) {
        User user=getUserData();
        User user2=getUserData();
        user.display();
        user2.display();
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
    //Get Data for Product
    //name, price, quantity, description
    // you have to implement the function for enter this datas from user
    // and display product function

}
