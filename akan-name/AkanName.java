import java.io.Console;

public class AkanName{
    
    public static int readDayOfWeek(){
        String[] weekDays = {"Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday", "Sunday"};
        Console console = System.console();
        while(true){
            String input = console.readLine("Enter A Day Of The Week: ");
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
            String input = console.readLine("Enter Your Gender: ");
            if(input.equals("male")){
                return 0;
            }
            else if(input.equals("female")){
                return 1;
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
        if(gender == 0){
            System.out.println("That Corresponds to: " + maleNames[dayIndex]);
        }
        else{
            System.out.println("That Corresponds to: " + femaleNames[dayIndex]);
        }
    }
}