package encapsulationAss;
import java.util.*;
public class B_SampleUser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin:");
		int pin=sc.nextInt();
		
		B_SampleAtm ob=new B_SampleAtm();
		ob.setPin(pin);
		
		B_SampleUser o=new B_SampleUser();
		o.validatePin(ob.getPin());
		
	}
	
	public void validatePin(int pin)
	{
		if(pin==1001||pin==1234||pin==1212)
		{
			System.out.println("Your pin:"+pin+" is valid");
		}
		else
		{
			System.out.println("Please enter a valid Pin.!!");
		}
	}

}
