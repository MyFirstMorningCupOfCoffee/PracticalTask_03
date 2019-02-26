import static io.InputWorker.readDoubleFromConsole;
import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printToConsole;
import static io.OutputWorker.printlnToConsole;

public class RingSquareCalculation 
{
    public static void main(String[] args)
    {
        runBriefing();
        
        double innerR, outerR;
        
        printlnToConsole("Please, input your parameters:");
        printToConsole("inner radius: ");
        innerR = readDoubleFromConsole();
        printToConsole("outer radius: ");
        outerR = readDoubleFromConsole();
        
        emptyLine();
        
        double innerRoundSquare, outerRoundSquare, ringSquare;
        
        innerRoundSquare = Math.PI * Math.pow(innerR, 2);
        outerRoundSquare = Math.PI * Math.pow(outerR, 2);
        ringSquare = outerRoundSquare - innerRoundSquare;
        
        printlnToConsole("The Ring square is " + String.format("%.2f", ringSquare));
        
    }
    
    
    public static void runBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application will help you to calculate square of ring with specified" 
                    + " inner and outer radiuses.",
            "You can input real nubers using either \".\" or \",\" as a delimeter.");

            emptyLine();
    }
}
