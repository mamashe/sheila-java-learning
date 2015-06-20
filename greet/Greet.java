import java.util.Scanner;
public class Greet{
	public static void main(String[] args){
		System.out.println("Hi there. What is your name? ");
			Scanner scanner = new Scanner(System.in);
				String name = scanner.nextLine();
					if (name.equals("")){
						System.out.println("Coward!");
					}
							else{
							System.out.println("oh hello," + name + ",welcome to java!");
							}
						
	}
}