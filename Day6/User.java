package Day6;

public class User {
    String  id;
    String name;
    String address;
    String phone;
    String email;
    String password;

    public void display(){
        System.out.println("id-->"+this.id);
        System.out.println("name-->"+this.name);
        System.out.println("address-->"+this.address);
        System.out.println("phone-->"+this.phone);
        System.out.println("email-->"+this.email);
        System.out.println("password-->"+this.password);
    }

}
