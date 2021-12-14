/**
 * WindFarm
 * 
 * @author shinhyeok Kang
 * @version 2020.04.01
 */
public class WindFarm2 implements IWindFarm
{
    private String farmname;
    private String buildcounrty;
    private double totalcapacity;
    private int totalnumberTurbines;
    private int builtyear;

    /**
     * WindFarm 클래스의 객체 생성자
     */
    public WindFarm2(String name, String country, double capacity, int numberTurbines, int year)
    {
        farmname=name;
        buildcounrty=country;
        totalcapacity=capacity;
        totalnumberTurbines= numberTurbines;
        builtyear=year;
    }

    /**
     * Print the windfarm data to the output terminal.
     */
    public void print()
    {
        System.out.println("Name: " + farmname + ", Country: "+ buildcounrty + ", Capacity: " + totalcapacity + ", Number of Turbines: " + totalnumberTurbines+ ", Year: " + builtyear);
    }
    
    /**
     * getPower method
     *
     */
    @Override
    public double getCapacity()
    {
    
        return totalcapacity;
    }

    /**
     * formatedPrint
     *
     * call this method when you need to print foramted farm data
     */
    @Override
    public void printf()
    {
        String farmdata =  String.format("| %-20s | %-20f | %-20s | %-20d |", farmname, totalcapacity, buildcounrty, totalnumberTurbines);
        System.out.println(farmdata);
    }

    
}