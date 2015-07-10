public class Point{
    
    double x;
    double y;
    
    public Point(){
        x = 0;
        y = 0;
    }
    
    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public void setX(double num1){
        this.x = num1;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void setY(double num2){
        this.y = num2;
    }
    
    public String toString(){
        return "(x " + this.x + " y " + this.y + ")";
    }
}