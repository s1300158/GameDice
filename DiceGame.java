import java.util.Scanner;
import java.util.Random;
class DiceGame{
    public static void main(String args[]) {
	
	System.out.println("What is your name?");
	System.out.print(">");
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	System.out.println("Hello," + name +"!");

	Random rand = new Random();
	int num1 = rand.nextInt(6)+ 1;
	int num2 = rand.nextInt(6)+ 1;
	System.out.println("Rolling dice...");
	System.out.println("Die 1:" + num1);
	System.out.println("Die 2:" + num2);
	int total = num1 + num2;
	System.out.println("Total value:" + total);

	if(total > 7){
	    System.out.println(name + " won!");
	}
	else  System.out.println(name +" lost!");


	
    }
}
