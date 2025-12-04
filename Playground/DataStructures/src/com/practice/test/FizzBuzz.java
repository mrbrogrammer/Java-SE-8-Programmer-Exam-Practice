package com.practice.test;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
