import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class AlgorithmCalculator {

	public void calculator(File file) throws FileNotFoundException {
		Scanner read = new Scanner(file);
		Stack<Integer> values = new Stack<Integer>();
		Stack operators = new Stack();
		Stack numbers = new Stack();
		
		String regexNumber = "[0-9]";
		int i = 0;
		char[] characters = read.next().toCharArray();
		String charString = String.valueOf(characters[i]);
		
		while(read.hasNext()) {
			charString = String.valueOf(characters[i]);
			if(Pattern.matches(regexNumber, charString)) {
				System.out.println(charString);
				numbers.push(charString);
				i++;
			}
			else {
				System.out.println(charString);
				operators.push(charString);
				i++;
			}
		}
		
	}
}
