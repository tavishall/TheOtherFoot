package theotherfoot;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to 'The Other Foot'");
		
		//create player. The stats should be set more EQ style. But for now...
		Player player = new Player("Character", 30, 10, 10);
		
		//set run to true. then enter the game loop.
		boolean run = true;
		while (run){
			System.out.println("What next?");
			scanner.next();
		}
		
	}

}
