import java.util.Scanner;
import java.util.InputMismatchException;

public class App{
    public static int readInteger(int num){
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.printf("Enter Number #%d: ", num);
            try{
                
                int i = scanner.nextInt();
                if(i<1){
                    System.out.printf("Sorry %d is not a possitive number. Try again.\n", i);
                    continue;
                }
                return i;
                }catch(InputMismatchException e){
                System.out.printf("Sorry %s is not a valid integer. Try again.\n", scanner.nextLine());
            }
        }   
    }    
    public static void main(String[] args){
    System.out.println("Please enter 10 possitive integers.");
        int sum = 0;
        for(int i=1; i<=10; ++i){
            sum += readInteger(i);
        }
        System.out.printf("The sum is %d ", sum);
    }
}