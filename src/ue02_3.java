import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("x-coordinate");
        double x = In.readDouble();
        
        Out.println("y-cooridinate");
        double y = In.readDouble();

        double r = 4;
        
        boolean rectangle = false; 
        boolean circle = false; 

        if((x <= 4 && x >= 0) && (y <= 4 && y >= 0)) {
            rectangle = true; 
        }
        if(Math.sqrt(x*x + y*y) <= r){
            circle =true; 
        }
        if(rectangle == true && circle == false){
            Out.println("point is in the green space");
        } else {
            Out.println("point is not in the green space");
        }
    }
}
