public class Prompt {
  
	static java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

	static int inputInt() {
    String Str = keyboardInput.nextLine();
    return Integer.parseInt(Str);
	}

	static int inputInt(String title) {
		System.out.print(title);
		String str = keyboardInput.nextLine();
		return Integer.parseInt(str);
	}

	static String inputString() {
		return keyboardInput.nextLine();
	}

	static String inputString(String title) {
	  System.out.print(title);
		return keyboardInput.nextLine();
	}

	static vo close() {
	  keyboardInput.close();
	}
}
