package meansofdigits;

import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printlnToConsole;
import static io.OutputWorker.printToConsole;
import static io.InputWorker.readStringFromConsole;


public class MeansOfDigits 
{
    public static void main(String[] args)
    {
        runBriefing();
        
        printToConsole("Please, input your number: ");
        String numberAsString = readStringFromConsole();
        emptyLine();
        
        int[] digits = getNumberDigitsAsIntArray(numberAsString);
        double arytnmMean = calcArythmMean(digits);
        double geomMean = calcGeomMean(digits);
        
        printlnToConsole("Table of results:",
                        " initial number: " + numberAsString,
                        "arythmetic mean: " + arytnmMean,
                        " geometric mean: " + geomMean);
    }
    
    private static void runBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application will help you to calculate arythmetic and geometric " 
                    + "means of digits in given number.",
            "You can input real nubers using either \".\" or \",\" as a delimeter.");

            emptyLine();
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
    
    private static double calcArythmMean(int ... numbers)
    {
        int sum = 0;
        
        for(int i : numbers)
        {
            sum += i;
        }
        
        return sum / (numbers.length + 0.0);
    }
    
    private static double calcGeomMean(int ... numbers)
    {
        long mult = 1;
        
        for(int i : numbers)
        {
            mult *= i;
        }
        
        return Math.pow(mult, 1.0 / numbers.length);
    }
}
