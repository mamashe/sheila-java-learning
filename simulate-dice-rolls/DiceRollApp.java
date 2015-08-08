import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class DiceRollApp{
    public static void main(String[] args){
        System.out.println("Enter the number of times you want to roll the dice: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.printf("Rolled a dice %d times. Distribution: \n", input);
        
        Random random = new Random();
        
        HashMap<Integer, Integer> dice = new HashMap<Integer, Integer>();
        dice.put(1, 0);
        dice.put(2, 0);
        dice.put(3, 0);
        dice.put(4, 0);
        dice.put(5, 0);
        dice.put(6, 0);
        
        for(int i = 0; i <= input; i++){
            int roll = random.nextInt(6)+1;
            dice.replace(roll, dice.get(roll) +1);
        
        }
        
        for(Integer k: dice.keySet()){
        System.out.printf("%d : %d\n ", k, dice.get(k));
        }
    }
}