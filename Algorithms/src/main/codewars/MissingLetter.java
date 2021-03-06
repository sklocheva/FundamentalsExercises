package main.codewars;

/**
 * Finds a missing letter from a sequence. 
 * Example: A, B, C, D, F
 * 
 * @author Sophie
 *
 */
public class MissingLetter {

	public static char findMissingLetter(char[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int number = (int) array[i] + 1;
			if (number != (int) array[i + 1]) {
				return (char) number;
			}
		}
		return ' ';
	}
}
