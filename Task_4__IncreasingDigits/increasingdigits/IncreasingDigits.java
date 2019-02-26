package increasingdigits;

import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printlnToConsole;
import static io.OutputWorker.printToConsole;
import static io.InputWorker.readDoubleFromConsole;

public class IncreasingDigits 
{
    public static void main(String[] args)
    {
        runBriefing();
        
        printToConsole("Please, input your number: ");
        double number = readDoubleFromConsole();
        boolean isProperSequence = isIncrSequence(number);
        
        printlnToConsole("This number " 
                            + (isProperSequence ? "can" : "can not") 
                            + " be read as increasing sequence of numbers.");
        
    }
    
    private static void runBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application will help you to check if digits in given number " 
                    + "can be read as increasing sequence of numbers.",
            "You can input real nubers using either \".\" or \",\" as a delimeter.");

            emptyLine();
    }
    
    private static boolean isIncrSequence(double number)
    {
        String numberAsString;
        
        /// this block helps us to get rid of extra useless zero in double type format ///
        if(number == (long) number)
        {
            numberAsString = (long) number + "";
        }
        else
        {
            numberAsString = number + "";
        }
        /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// 
        
        numberAsString = numberAsString.replaceFirst("[.]", "");
        char[] digitsAsCharArray = numberAsString.toCharArray();
        
        for(int i = 0; i < digitsAsCharArray.length - 1; i++)
        {
            if(digitsAsCharArray[i] >= digitsAsCharArray[i + 1])
            {
                return false;
            }
        }
        
        return true;
    }
}
