import java.io.Console;

public class AkanName{
    
    public static int readDayOfWeek(){
        String[] weekDays = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        Console console = System.console();
        while(true){
            String input = console.readLine("Enter A Day Of The Week: ").toUpperCase();
            for(int i = 0; i<weekDays.length; ++i){
                if(input.equals (weekDays[i])){
                    return i;
                    
                }
                
            }
            System.out.println("Sorry you have typed invalid day. Try again.");
        }
    }
    
    public static int readGender(){
        Console console = System.console();
        while(true){
            String input = console.readLine("Enter Your Gender: ").toLowerCase();
            if(input.equals("male")){
                return 1;
            }
            else if(input.equals("female")){
                return 0;
            }
            else{
                System.out.println("Sorry wrong gender type");
            }
        }
    }
    
    public static void main(String[] args){
       String[] femaleNames = {"Adwoa", "Abena", "Ekua", "Yaa", "Efua", "Ama", "Akosua"};
       String[] maleNames = {"Kwojo", "Kwabena", "Kweku", "Yaw", "Kofi", "Kwame", "Kwesi"};
      //String[] names = {"Adwoa", "Abena", "Ekua", "Yaa", "Efua", "Ama", "Akosua", "Kwojo", "Kwabena", "Kweku", "Yaw", "Kofi", "Kwame", "Kwesi"};
        int gender = readGender();
        int dayIndex = readDayOfWeek();
        
        //System.out.println("I got: " + gender);
        if(gender == 1){
            System.out.println("That Corresponds to: " + maleNames[dayIndex]);
        }
        else{
            System.out.println("That Corresponds to: " + femaleNames[dayIndex]);
        }
    }
}