public class AkanName{
    public int readDayOfWeek(String week){
        String[] dayOfWeek = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        
        while (true){
            System.out.println("Enter the day you were born: ");
      
            for(int i = 0; i < dayOfWeek.length; ++i){
                if(week.equals(dayOfWeek[i])){
                    return i;
                }
            }
            System.out.println("Sorry you have entered invalid day. Try again.");
        }
    }
    
    public int readGender(String gen){
        
        while (true){
            System.out.println("Enter your gender: ");
           
            if(gen.equals("female")){
                return 0;
            }
            else if(gen.equals("male")){
                return 1;
            }
            else{
                System.out.println("Invalid gender. Try again");
            }
        }
        
    }
    
    public int readNames(int gender, int day){
        String[] femaleNames = {"Adwoa", "Abena", "Ekua", "Yaa", "Efua", "Ama", "Akosua"};
        String[] maleNames = {"Kwojo", "Kwabena", "Kweku", "Yaw", "Kofi", "Kwame", "Kwesi"};
        
       // int gender = readGender();
        //int day = readDayOfWeek();
        
        if(gender == 0){
            System.out.println("You are " + femaleNames[day]);
            
        }
        else{
            System.out.println("You are " + maleNames[day]);
        }
    }
    
}