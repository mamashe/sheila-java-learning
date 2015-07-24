import java.util.Random;

public class App{
    public static void main(String[] args){
        int i;
        Random r = new Random();
        for(i = 0; i <= 10; i++){
            System.out.println(r.nextInt(100));
        }
        
    }
}