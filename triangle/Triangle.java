import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int base, height, ans;
        System.out.println("What is the base of a triangle? ");
        base = scanner.nextInt();
        System.out.println("What is the height of a triangle? ");
        height = scanner.nextInt();
        ans = base * height/2;
        System.out.printf("The Area Of A Triangle is %d. ", ans);
        
    }
}    