import java.util.Scanner;
import java.util.InputMismatchException;

public class App{
    public static int readInteger(int prompt){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("Enter Numnber # %d: ", prompt);
            try{
                
                int i = scanner.nextInt();
                if(i<1){
                    System.out.printf("Sorry %d is not a positive number. Try again.\n", i);
                    continue;
                }
                return i;
                } catch (InputMismatchException e) {    
                System.out.printf("Sorry, but %s is not a valid integer. Try again.\n", scanner.nextLine());
                }   
        }
    }
    public static void main (String[] args){
        int sum = 0;
        for(int i=1; i<=3; ++i){
            sum += readInteger(i);
        }
        System.out.printf("The sum is %d ", sum);
        
    }
    
}