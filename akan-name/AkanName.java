import java.util.Scanner;

public class AkanName{
    public String gender;
    public String days;
    
    public AkanName(){
        gender = ("Male, Famle");
        days = ("Monday, Tuesday, Wednessday, Thursday, Friday");
        
    }
    
    public String getGender(){
        Scanner scanner =new Scanner(System.in);
        while(true){
          
            String gen = scanner.nextLine();
            if(!gen.equals("gender")){
                System.out.printf("%s is not a gender type. Type a correct gender. ", gen);
                continue;
            }
            return gen;
        } 
    }
    
    public String getDay(){
        Scanner scanner =new Scanner(System.in);
        while(true){
            System.out.println("Please Enter The Day You Were Born: ");
            String day1 = scanner.nextLine();
            if(!day1.equals("days")){
                System.out.printf("%s is not a day. Type a correct day. ", day1);
                continue;
            }
            return day1;
        }   
    }
    
    public String getDay1(String mal){
        if(mal.equals("Monday")){
            System.out.println("Your Name is Kojo");
        }
        else if(mal.equals("Tuesday")){
			System.out.println("Your Name is Kobina");
        }
        else if(mal.equals("Wednessday")){
            System.out.println("Your Name is Kwaku");
        }
        else if(mal.equals("Thursday")){
			System.out.println("Your Name is Yaw");
        }
        else if(mal.equals("Friday")){
			System.out.println("Your Name is Kofi");
        }
        else if(mal.equals("Saturday")){
			System.out.println("Your Name is Kwame");
        }
        else if(mal.equals("Sunday")){
			System.out.println("Your Name is Kwasi");
        }
        return mal;
    }
    
    
    
    
    public String getFemale(String fe){
        if(fe.equals("Monday")){
            System.out.println("Your Name is Adjoa");
        }
        else if(fe.equals("Tuesday")){
			System.out.println("Your Name is Abina");
        }
        else if(fe.equals("Wednessday")){
			System.out.println("Your Name is Akua");
        }
        else if(fe.equals("Thursday")){
			System.out.println("Your Name is Yaa");
        }
        else if(fe.equals("Friday")){
			System.out.println("Your Name is Afua");
        }
        else if(fe.equals("Saturday")){
			System.out.println("Your Name is Ama");
        }
        else if(fe.equals("Sunday")){
			System.out.println("Your Name is Akosua");
        }
        return fe;
    }
    
    public static void main(String[] args){
          System.out.println("Please Enter Your Gender: "); 
    }
}