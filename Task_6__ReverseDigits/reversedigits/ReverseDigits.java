package reversedigits;

import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printlnToConsole;
import static io.OutputWorker.printToConsole;
import static io.InputWorker.readStringFromConsole;

public class ReverseDigits 
{
    public static void main(String[] args)
    {
        runBriefing();
        
        printToConsole("Please, input your number: ");
        String numberAsString = readStringFromConsole();
        printlnToConsole("Reversed number is " + reverseNumber(numberAsString));
    }
    
    
    private static void runBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application will reverse digits in positive integer number for you.");

            emptyLine();
    }
    
    public static String reverseNumber(String text)
    {
        String responce = "";
        boolean nonZeroDigitWritten = false;
        
        for(int i = text.length() - 1; i >= 0; i--)
        {
            char ch = text.charAt(i);
            if(ch == '0')
            {
               if(nonZeroDigitWritten)
               {
                   responce += ch;
               }
            }
            else
            {
                responce += ch;
                nonZeroDigitWritten = true;
            }
        }
        
        return responce;
    }
    
    private static int[] getNumberDigitsAsIntArray(String number)
    {
        number = number.replaceFirst("[.]", "");
        char[] digitsAsCharArray = number.toCharArray();
        int[] digitsAsIntArray = new int[ digitsAsCharArray.length ];
        
        for(int i = 0; i < digitsAsCharArray.length; i++)
        {
            digitsAsIntArray[i] = Integer.parseInt(digitsAsCharArray[i] + "");
        }
        
        return digitsAsIntArray;
        
    }
}
