import java.util.Scanner;
    public class June{
        public static void main (String[]args){
            Scanner junejava =new Scanner (System.in);
            System.out.print ("Enter your name: ");
            String name= junejava.nextLine();
            

            System.out.print("Enter your Age:");
            int Age=junejava.nextInt();


            System.out.println("Your name is: " +name+ " and you are: "+Age+ "years old");
            junejava.close();
        
        }
    }
