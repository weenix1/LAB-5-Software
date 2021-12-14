import java.util.ArrayList;

import java.util.HashSet;


/**
 * Write a description of class WindFarmTable here.
 *
 * @author (Hilary Ogalagu)
 * @version (15.04.2020)
 */
public class WindFarmTable
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<IWindFarm> windFarms;// allow later to add objects of the
    //type windFarm to this ArrayList
    
    
    /**
     * Constructor for objects of class WindFarmTable
      */
    public WindFarmTable()
    {
        // initialise instance variables
         this.name = name;
        this.windFarms = new ArrayList<IWindFarm>();//initializes this windFarm
        //with an empty ArrayList
        //this.totalPower = totalPower;
        
    }
    
    /**
      * add some power stations to this windFarm's accumulated power station
     */
    public void addPowerStation(IWindFarm powerStation)
    {
        windFarms.add(powerStation);
    }
    
   
     /**
     * add automatically the total power of the windfarm 
     * @ param returns sum of power of all windFarms
     */
    
    public double getTotalPower()// allows to get the totalpower and capacity of the windFarm
     {
       double totalPower = 0;
       for(IWindFarm windFarm : windFarms)
       {
           totalPower += windFarm.getCapacity();
        }
        return totalPower;
     }
    
   
     /**
     * Prints the list of the windFarm in a formated form
     */
     public void printTable()
     {
        
        System.out.println(IWindFarm.header());
        for(IWindFarm windFarm : windFarms)
        {
            windFarm.printf();
        }
       
     }
    
       
      
}