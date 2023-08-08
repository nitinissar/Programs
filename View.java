import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Name!");
		String name = scanner.nextLine();
		
		System.out.println("Enter your Email");
		String email =scanner.nextLine();
		
		System.out.println("Enter your Age");
		int age = scanner.nextInt();
		
		System.out.println("This is your name"+name);
		System.out.println("This is your email"+email);
		System.out.println("This is your age"+age);

		scanner.close();
	}

}
