package studio2;

import java.util.Scanner;

public class studio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Over the course of the day you repeatedly play a game, which has known odds of 
		//winning called the “win chance”.
		//Each time you play, you win or lose $1 based on the “win chance”. 
		//So the money you have increases or decreases by 1 after each game.
		//If the amount of money you have ever hits a “win limit,” you stop gambling and 
		//leave the casino for the day. It was a successful day!
		//If you lose all of your money you also stop gambling. The day was a ruin!
		
		System.out.println("What is your start amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();

		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		
		while (startAmount < winLimit && startAmount > 0) {
			double randomNumber = Math.random();
			if (randomNumber < winChance) {
				startAmount = startAmount + 1;
				System.out.println("win");
			}
			else {
				startAmount = startAmount - 1;
				System.out.println("loss");
			}
		}
		
		
		
	}

}
