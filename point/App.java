import java.util.Scanner;

public class App{

    public static void main(String[] args){
        System.out.println("Enter x , y cordinates: ");
        Scanner scanner = new Scanner(System.in); 
        Point p = new Point(5, -3);
        String input = scanner.nextLine();
        System.out.println(p);
    }
}