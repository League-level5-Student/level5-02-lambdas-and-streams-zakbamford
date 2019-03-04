package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String back = "";
			for (int i = s.length() - 1; i >= 0; i--)
				back += s.charAt(i);
			s = back;

			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String mix = "";
			Random r = new Random();
			for (int i = 0; i < s.length(); i++)
				if (r.nextInt(2) == 0)
					mix += s.substring(i, i + 1).toUpperCase();
				else
					mix += s.charAt(i);
			s = mix;
			
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String per = "";
			for (int i = 0; i < s.length(); i++) {
				per += s.charAt(i) + ".";
			}
			s = per.substring(0, per.length() - 1);
			
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			String nov = "";
			for (int i = 0; i < s.length(); i++)
				if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'))
					nov += s.charAt(i);
			s = nov;
			
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
