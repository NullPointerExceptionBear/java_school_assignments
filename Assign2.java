import java.util.*;
import java.text.DecimalFormat;
public class Assign2
{
	public static void main(String []arg)
	{
		float hourRate;
		int hours, overTime;
		float pay;
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$0.00");

		for(int count = 1; count <=3; count++)
		{
			System.out.println();
			System.out.print("Enter hourly rate: ");
			hourRate = scan.nextFloat();
			
			System.out.print("Enter hours worked: ");
			hours = scan.nextInt();
			
			if(hours > 40)
			{
				overTime = hours - 40;
				pay = hourRate * (hours - overTime);
				hourRate = 1.5f * hourRate;
				pay = pay + (hourRate * overTime);
			}
			else
			{
				pay = hourRate * hours;
			}
			System.out.println("Pay for Employee " + count + " is " + money.format(pay));
		}
	}
}