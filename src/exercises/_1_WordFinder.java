package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _1_WordFinder {

	public static void main(String[] args) {
		/* Print all the words beginning with P that are over 10 characters. */
		Stream<String> streamOfWords = loadWordList().stream();

		List<String> selectedWords = streamOfWords.filter(word -> word.length() > 10)
				.filter(word -> word.charAt(0) == 'P').collect(Collectors.toList());
		
		
		System.out.println(selectedWords);

	}

	public static List<String> loadWordList() {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");

		try {
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = bf.readLine()) != null) {
				messages.add(aLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return messages;
	}

}