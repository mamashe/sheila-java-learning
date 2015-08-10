import java.util.Random;

public class RandomRange{
    public static void main(String[] args){
        int minValue = 5;
        int maxValue = 50;
        Random random = new Random();
        for(int i = 0; i <= 10000; i++){
            int range = random.nextInt(11)+5;
            if(range <= minValue){
                minValue++;
            }
            else if(range >= maxValue){
                maxValue++;
            }
            /*
            else{
                System.out.println("Can't Update");
            }
            */
        
        }
        
        System.out.printf("Minmum value is %d\n and MaxValue is %d", maxValue, minValue);
    }
}