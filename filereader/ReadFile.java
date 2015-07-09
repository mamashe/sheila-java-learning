import java.io.*;

public class ReadFile{
    public static void main(String[] args){
        String fileName = "readme.txt";
        
        
        for(String arg : args) 
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((arg = bufferedReader.readLine()) != null){
                System.out.println(arg);
            }
            
        }
        
        catch(FileNotFoundException ex){
            System.out.println("Unable to open '" + fileName + "'");
        }
        
        catch(IOException ex){
            System.out.println("Error reading '" + fileName + "'");
        }
    }
}