package Day8;

public class Ex1 {
    public static void main(String[] args) {
        starPrinter(5);
    }
    public static void starPrinter(int countOfStar){
        while(countOfStar>0){
            System.out.println("*");
            countOfStar--;
        }
    }
}
