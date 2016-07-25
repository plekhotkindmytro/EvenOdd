package dmytro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {

	public static void main(String[] args) {

		System.out.println("Please enter a number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer number = null;
		do {
			try {
				String numberString = reader.readLine();
				number = Integer.parseInt(numberString);
			} catch (IOException e) {
				System.out.println("Number format is wrong. Please enter an integer:");
			}
		} while (number == null);

		if (number % 2 == 0) {
			System.out.println("Number " + number + " is even.");
		} else {
			System.out.println("Number " + number + " is odd.");
		}

	}

}
