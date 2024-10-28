import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("First Number:");
        int numberOne = In.readInt();

        Out.println("Second Number:");
        int numberTwo = In.readInt();

        Out.println("Third Number:");
        int numberThree = In.readInt();

        int max = 0;

        if(numberOne >= numberTwo && numberOne >= numberThree) {
            max = numberOne;
        } else if (numberTwo > numberOne && numberTwo >= numberThree){
            max = numberTwo;
        } else {
            max = numberThree;
        }
        Out.println("maximum:");
        Out.println(max);
    }
}
