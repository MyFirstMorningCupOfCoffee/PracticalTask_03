package switchingvariables;

import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printlnToConsole;

public class SwitchingVariables 
{
    public static void main(String[] args)
    {
        showBriefing();
        
        int a, b;
        
        // 1st
        a = 985;
        b = -1021;
        printlnToConsole(":::part 1:::", "before:");
        demonstrateVariables(a, b);
        
        a += b;
        b = a - b;
        a = a - b;
        printlnToConsole("after:");
        demonstrateVariables(a, b);
        
        emptyLine();
        
        // 2nd
        a = 11987;
        b = -3;
        printlnToConsole(":::part 2:::", "before:");
        demonstrateVariables(a, b);
        
        a ^= b;
        b ^= a;
        a ^= b;
        printlnToConsole("after:");
        demonstrateVariables(a, b);
        
        
        
        
    }
    
    
    private static void showBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application shows how 2 integer value can be switched without" + 
                    " creating additional variables.");

            emptyLine();
    }
    
    private static void demonstrateVariables(int a, int b)
    {
        printlnToConsole("a = " + a + ", b = " + b);
    }
}
