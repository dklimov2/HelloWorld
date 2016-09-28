package my_proj;

public class PrintToConsole {

	public void print(String str) {
		for (int i = 0; i < 10; i++) {
			System.out.println(str + " " + i);
			if (true) {

			}
		}
	}

	protected String test(int x) {
		return "it was: " + x;
	}
}
