
/**
 * Write a description of interface IWindFarm here.
 *
 * @author Hilary Ogalagu
 * @version 18 May 2020
 */
public interface IWindFarm 
{
    static String header ()
    {   
        
        //String head1 = String.format("|%-20s|","WindFarms");
        String head2 = WindFarm.getHeader();
        //System.out.println(head1);// windFarmTable header, general info
        System.out.println(head2);
        return "";
    }
    
    double getCapacity();
     
    void printf();
}
