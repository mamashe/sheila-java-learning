import java.util.Scanner;

public class AkanNameApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        AkanName name = new AkanName();
        
        String input = scanner.nextLine().toUpperCase();
        name.readDayOfWeek(input);
        
        String input2 = scanner.nextLine().toLowerCase();
        name.readGender(input2);
        
        System.out.println(name.readNames());
         
    }
}