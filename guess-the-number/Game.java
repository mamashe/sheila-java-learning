import java.util.Scanner;
import java.util.Random;

public class Game{
    public static int ranGame(){
        while(true) { 
            System.out.println("Guess A Number: ");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            int count =0;
            
            Random random = new Random();
            int num = random.nextInt(100)+1;
            //for(int i = 0; i <= guess; i++){
            
            if(guess < num){
                System.out.println("too low");
                count++;
                }else if(guess > num){
                System.out.println("too high");
                count++;
                }else{
                System.out.println("You've got it!");
                System.out.printf("You needed %d to win this game", count);
            }
        }
        
    }
    
}