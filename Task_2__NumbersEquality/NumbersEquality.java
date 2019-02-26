package numbersequality;

import static io.InputWorker.readDoubleFromConsole;
import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printToConsole;
import static io.OutputWorker.printlnToConsole;

public class NumbersEquality 
{
    public static void main (String[] args)
    {
        runBriefing();
        
        double num1, num2, num3;
        
        printlnToConsole("Please, input your numbers:");
        printToConsole("#1: ");
        num1 = readDoubleFromConsole();
        printToConsole("#2: ");
        num2 = readDoubleFromConsole();
        printToConsole("#3: ");
        num3 = readDoubleFromConsole();
        
        boolean equality = checkIfEqual(num1, num2, num3);
        String responce = equality ? "equal" : "not equal";
        
        printlnToConsole("These numbers are " + responce);
        
        
    }
    
    
    public static void runBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application will help you to check if 3 numbers of yours are" 
                    + " equal or not.",
            "You can input real nubers using either \".\" or \",\" as a delimeter.");

            emptyLine();
    }
    
    public static boolean checkIfEqual(double ... nums)
    {
        
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] != nums[i + 1])
            {
                return false;
            }
        }
        
        return true;
    }
}
