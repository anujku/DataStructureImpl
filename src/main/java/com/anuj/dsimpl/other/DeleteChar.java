package com.anuj.dsimpl.other;

import java.io.*;

public class DeleteChar {

	static void deleteChar(String word, char c) {
		if (word.contains(Character.toString(c))) {
			String s = Character.toString(c);
			word = word.replaceAll(s, "");
		}
		
		System.out.println("After deleting " + c + " we have new word as : " + word);
	}

	public static void main(String[] args) throws IOException {
		String choice = "";
		String word = "";
		char c = 0;
		BufferedReader reader;
		while (!(choice.equals("1") && Character.isLetter(c))) {
			System.out.println("Enter a word");
			reader = new BufferedReader(new InputStreamReader(System.in));
			word = reader.readLine();
			word = word.replaceAll("\\s", "");
			System.out.println("You entered : " + word);
			System.out
					.println("Press 1 to continue any com.anuj.dsimpl.other key to enter again");
			choice = reader.readLine();
			System.out.println("Enter a character to delete from " + word);
			DataInputStream in = new DataInputStream(System.in);
			c = (char) in.readByte();
		}

		deleteChar(word, c);
	}
}
