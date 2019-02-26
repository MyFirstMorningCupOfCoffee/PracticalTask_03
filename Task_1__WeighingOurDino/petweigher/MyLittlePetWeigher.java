package petweigher;

import static io.InputWorker.readDoubleFromConsole;
import static io.OutputWorker.printlnToConsole;
import static io.OutputWorker.printToConsole;
import static io.OutputWorker.emptyLine;

public class MyLittlePetWeigher
{

    public static void main(String[] args) 
    {
        runBriefing();
        
        printToConsole("Please, input your dino's weight in kilograms: ");
        double weightInKilos = readDoubleFromConsole();
        
        emptyLine();
        
        double weightInGrams = Weigher.getInGrams(weightInKilos);
        double weightInMillis = Weigher.getInMilligrams(weightInKilos);
        double weightInTons = Weigher.getInTons(weightInKilos);
        
        printlnToConsole(
            "Table of results:",
            "milligrams: " + String.format("%.2f", weightInMillis),
            "     grams: " + String.format("%.2f", weightInGrams),
            " kilograms: " + String.format("%.2f", weightInKilos),
            "      tons: " + String.format("%.2f", weightInTons));
    }
    
    
    public static void runBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application will show you how heavy your little pet is" 
                    + " in various units of weigh.",
            "You can input real nubers using either \".\" or \",\" as a delimeter.");

            emptyLine();
    }

}
