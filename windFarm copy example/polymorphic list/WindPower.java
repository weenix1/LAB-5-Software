
/**
 * Abstract class WindPower provides common functionality of it's subclasses.
 * Generally, abstract classes cannot be instantiated, but 
 * constructors are used by super-calls of subclass constructors.
 * @author Hilary Ogalagu
 * @version 2020.05.23
 */
public abstract class WindPower implements IWindFarm
{
    // instance variables - replace the example below with your own
    private String name;
    private String country;
    // the capacity of the windFarm
    private double capacity;
    // the number of Turbines
    private int numberTurbines;
    // the year the windFarm was created
    private int year;

    
    protected WindPower(String author)
    {
        name = author;
        
    }
    
    public String getName()
    {
        
        return name;
    }
    
    public String country()
    {
        return country;
    }
    
    
    public double capacity()
    {
        return capacity;
    }
    
     /**
     * Print the windfarm data to the output terminal.
     */
    public void print()
    {
        
        System.out.println("Name: " + name + ", Country: "+ country + ", Capacity: " + capacity + ", Number of Turbines: " + numberTurbines+ ", Year: " + year);
    }
    
    /**
     * formatedPrint
     *
     * call this method when you need to print foramted farm data
     */
    
    public void printf()
    {
        String farmdata =  String.format("| %-20s | %-20f | %-20s | %-20d |", name, capacity, country, numberTurbines);
        System.out.println(farmdata);
    }
}
