package com.fju.Guess1To10experiment;

import java.util.Random;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println("Your target is:" + secret);
		for(int i = 0; i < 3; i++) {
		System.out.println("Please enter a number from 1-10:");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println("User:" + s);
		int num = Integer.parseInt(s);
		if (num > secret) {
			System.out.println("Smaller!");
		}
			else if (num < secret) {
				System.out.println("Bigger!");
			}
				else {
						System.out.println("Well Done!");
					}
		}
		System.out.println("Goodbye!");
	}

}
