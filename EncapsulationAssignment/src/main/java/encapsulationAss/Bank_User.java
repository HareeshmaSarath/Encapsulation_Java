package encapsulationAss;
import java.util.*;
public class Bank_User {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Pin:");
		int pin=sc.nextInt();
		
		Bank_ATM ob=new Bank_ATM();
		ob.setPin(pin);
		int get=ob.getPin();
		
		if(get==0)
		{
			System.out.println("Please enter a valid Pin.!!");
		}
		else
		{
			System.out.println("Your pin:"+get+" is valid");
		}	
	}
}