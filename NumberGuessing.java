package com.NumberGuessing;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scan1.next();
		System.out.println(name+ " i am thinking of a number bw 1 to 20");
		int myNumber = getRandomNumber(1,21);
		for(int i=0;i<6;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			System.out.println("take a guess");
			int yourguess = scan2.nextInt();
			
			if(yourguess == myNumber)
			{
				System.out.println("your guess is correct");
				break;
			}
			else if(yourguess < myNumber)
			{
				System.out.println("your guess is too low");
			}
			else if(yourguess > myNumber)
			{
				System.out.println("your guess is high");
			}
			if(i>=5)
			{
				System.out.println();
				System.out.println("nope, the number i was thinking was:" +myNumber);
			}
		}
		
		
			}

	public static int getRandomNumber(int min, int max) 
	{
		Random random = new Random();
		return random.ints(min,max).findAny().getAsInt();//.findFirst()
		
		
	}

	

}
