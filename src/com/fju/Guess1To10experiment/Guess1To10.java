package com.fju.Guess1To10experiment;

import java.util.Random;

import java.util.Scanner;

public class Guess1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println("Your target is:" + secret);
		System.out.println("Please enter a number from 1-10:");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println("User:" + s);
		int num = Integer.parseInt(s);
		if (num > secret) {
			System.out.println("Smaller!");
		}
		if (num < secret) {
			System.out.println("Bigger!");
		}
		if (num == secret) {
			System.out.println("Well Done!");
		}
	}

}
