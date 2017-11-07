import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = reader.next();
		HelloUser helloUser = new HelloUser(name);
		helloUser.greetUser();
	}

}
