import java.util.Scanner;

public class Zodiac{
    public static int readMonthOfYear(){
        String[] Months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter the month you were born: ");
            String input = scanner.nextLine().toUpperCase();
            for(int i=0; i<Months.length; ++i){
                if(input.equals(Months[i])){
                    return i;
                }
            }
            System.out.println("Sorry invalid Month. Try Again.");
        }
    }
    
    public static int readDayOfBirth() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the day you were born: ");
            int input = sc.nextInt();
            if (input > 0 && input < 32) {
                return input;
            } else {
                System.out.println("Not a valid day. Try again.");
            }
        }
    }
    
    public static boolean shouldUpdateIndex(int month, int day) {
        int[] cutoffs = {20, 19, 20, 20, 21, 21, 22, 22, 23, 23, 22, 21};
        if (day > cutoffs[month]) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String getZodiacSign(int index) {
        String[] sign = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};
        if (index >= sign.length) {
            index = 0;
        }
        return sign[index];
    }
    
    public static void main(String[] args){
        int month = readMonthOfYear();
        int day = readDayOfBirth();
        if (shouldUpdateIndex(month, day)) {
            month++;
        }
 
        System.out.printf("Your zodiac sign is: %s\n", getZodiacSign(month));
    }
      
}