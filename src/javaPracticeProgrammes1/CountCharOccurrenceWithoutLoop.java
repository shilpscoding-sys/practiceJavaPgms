package javaPracticeProgrammes1;

public class CountCharOccurrenceWithoutLoop {

	public static void main(String[] args) {
		// Count Character Occurrence in a String Without loop

		String str = "java is java again java again";
		char c = 'i';
		int count = str.length()-str.replace("i", "").length();
	System.out.println(count);
	}
	}


