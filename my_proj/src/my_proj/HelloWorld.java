package my_proj;

public class HelloWorld {

	String string = "aasdasd", hhhh = "1";

	public void maifffn() {

		System.out.println(string);

		test(string);
		System.out.println(string);

	}

	protected static String test(String kk) {
		return kk += "228" + kk;
	}

	public static void main(String[] args) {
		HelloWorld world = new HelloWorld();
		world.maifffn();

	}

}
