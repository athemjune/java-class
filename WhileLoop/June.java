import.java.util.Scanner

public class WhileLoop
public static void main(String[]arg){
    Scanner input =new Scanner (System.in);

    int m=input.nextlnt();
    while(m<1|| m>10){
        System.out.print(m+ "is not between 1 and 10. try again :");
        m=input.nextlnt();


        System.out.println(m+ "is bettwen 1 and 10:");
    }
}