import java.util.ArrayList;

public class Car
{
	private String model;
	private int year;
	private double value;
	//make static array showroom


	public Car(String model, int year, double value)
	{
		this.model = model;
		this.year = year;
		this.value = value;
		//add this car to showroom

	}

	//getter methods for each specific object so therefore not static
	public String getModel()
	{
		return this.model;
	}
	public int getYear()
	{
		return this.year;
	}
	public double getValue()
	{
		return this.value;
	}

	//static methods


	public static String printShowroom()
    {
        String names = "";
        for(Car name: showroom)
        {
            names+= name.getModel() + "\n";
        }
        return "\n" + names;
    }
}
