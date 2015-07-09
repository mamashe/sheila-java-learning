import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double base, height, ans;
        System.out.println("What is the base of a triangle? ");
        base = scanner.nextInt();
        System.out.println("What is the height of a triangle? ");
        height = scanner.nextInt();
        ans = base * height/2;
        System.out.printf("The Area Of A Triangle is %2f. ", ans);
        
    }
}    