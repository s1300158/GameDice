import java.util.Scanner;
class DiceGame{
    public static void main(String args[]) {

	System.out.println("What is your name?");
	System.out.print(">");
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	System.out.println("Hello," + name +"!");
	
    }
}
