package petweigher;

public class Weigher 
{
    private static final double GRAMS_IN_KILOGRAM = 1_000.0;
    private static final double MILLIGRAMS_IN_KILOGRAM = 1_000_000.0;
    private static final double TONS_IN_KILOGRAM = 0.001;
    
    
    
    private Weigher()
    { }
    
    
    
    public static final double getInGrams(double kilograms)
    {
        return kilograms * GRAMS_IN_KILOGRAM;
    }
    
    public static final double getInMilligrams(double kilograms)
    {
        return kilograms * MILLIGRAMS_IN_KILOGRAM;
    }
    
    public static final double getInTons(double kilograms)
    {
        return kilograms * TONS_IN_KILOGRAM;
    }
    
}
