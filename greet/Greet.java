import java.util.Scanner;
public class Greet{
	public static void main(String[] args){
		System.out.println("Hi there. What is your name? ");
			Scanner name = new Scanner(System.in);
				System.out.println(name.nextLine());
					if (name == " "){
						System.out.println("Coward!");
					}
							else{
							System.out.println("oh hello," + name + ",welcome to java!");
							}
						
	}
}