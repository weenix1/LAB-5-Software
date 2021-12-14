import java.util.ArrayList;
/**
 * Write a description of class WindFarm here.
 *
 * @author ( Hilary Ogalagu)
 * @version (03, April 2020) 
 * 
 */
public class WindFarm extends WindPower
{
    // fields class scope
    // the windFarm's name
    //private String name;
    // the country
    //private String country;
    // the capacity of the windFarm
    //private double capacity;
    // the number of Turbines
    //private int numberTurbines;
    // the year the windFarm was created
    //private int year;

    /**
     * Constructor for objects of class WindFarm
     */
    //parameters method scope
    public WindFarm() {
        // initialise instance variables // make references to the object field
        super(author);
        //this.name = name;// currect object that makes access to the class scope
        //this.country = country;
        //this.capacity = capacity;
        //this.numberTurbines = numberTurbines;
        //this.year = year;
    }
    
    /**
     * Add the capacity of the windFarm
     */
     public double getCapacity() 
    {
        return capacity;
    }
    
    /**
     * Method getCountry
     *
     * @return The return value
     */
    public String getCountry(){
        return country;
    }
    
    /**
     * Method getName
     *
     * @return The return value
     */
    public String getName()
    {
      return name;  
    }
    
    /**
     * Method getYear
     *
     * @return The return value
     */
    public int getYear()
    {
      return year;  
    }
   
    
    /**
     * Method getNumberTurbines
     *
     * @return The return value
     */
    public int getNumberTurbines()
    {
        return numberTurbines;
    }
    
     /**
     * Print the windfarm name and datas to the output terminal.
     */
    
    public void print() //allows the system to print the windfarm 

    {
       System.out.println("name:" + name + ", country:" + country + ", capacity:" + capacity + ", numberTurbines:"  + numberTurbines + ", year:" + year);
      }
    
   /**
    * a method call that returns the variables
    */ 
   public static String getHeader()// gives the formate the object is to be printed
   {
      return String.format("|%-20s|%-20s|%-20s|%-20s|%-20s|","NAME", "COUNTRY","CAPACITY","NUMBERTURBINES","YEAR");
        
    }
    
    public String getRow()
    {
        return String.format("|%-20s|%-20s|%-20f|%-20d|%-20d", name , country,
        capacity , numberTurbines , year);
    }
    
    /**
     * Method printf
     * prints the list of windFarm in a formated way
     */
    @Override
    public void printf(){//
        
       System.out.printf("|%-20s|%-20s|%-20f|%-20d|%-20d",name,country,
       capacity,numberTurbines,year);    
    }
}
