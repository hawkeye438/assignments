import java.io.File;


public class AlgorithmCalculatorDriver {

	public static void main(String[] args) {
			
		AlgorithmCalculator stackCalculator = new AlgorithmCalculator();
		File file = new File("expressions.txt");
		File here = new File(".");
		System.out.println(here.getAbsolutePath());
			
		try {
			stackCalculator.calculator(file);
		}
		catch(Exception e) {
			System.out.println("Missing File...");
		}
		
	}
}
