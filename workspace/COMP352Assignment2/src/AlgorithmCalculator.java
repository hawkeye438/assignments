import java.io.*;
import java.util.*;
import java.util.regex.*;

public class AlgorithmCalculator {

	public void calculator(File file) throws FileNotFoundException {
		Scanner read = new Scanner(file);
		Stack<Integer> values = new Stack<Integer>();
		Stack operators = new Stack();
		Stack numbers = new Stack();
		
		Pattern p = Pattern.compile("(\\d+\\.\\d+)|(\\d+)|([+-/*///^])|([/(/)])|(>=)");
		Matcher m = p.matcher(read.next());
		
		String regexNumber = "[0-9]+";
		int i = 0;
		String[] elements = read.next().split("[^0-9!-*/+[>?=][<?=][=?=][!=]]*");
		//String charString = elementString;
		
		//while(m.find())
		//      System.out.println(m.group());
		
		while(m.find() && read.hasNextLine()) {
			String elementString = m.group();
			if(Pattern.matches(regexNumber, elementString)) {
				System.out.print(elementString + " ");
				numbers.push(elementString);
				i++;
			}
			else {
				System.out.print(elementString + " ");
				operators.push(elementString);
				i++;
			}
		}
		
	}
}
