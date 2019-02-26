package io;

public class OutputWorker 
{
    
    private OutputWorker()
    { }
    
    
    public static void printlnToConsole(String... text)
    {
        for(String s : text)
        {
            System.out.println(s);
        }
    }
    
    public static void printToConsole(String text)
    {
        System.out.print(text);
    }
    
    public static void emptyLine()
    {
        System.out.println();
    }

}
