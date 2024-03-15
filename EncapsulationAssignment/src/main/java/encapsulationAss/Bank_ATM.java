package encapsulationAss;

public class Bank_ATM {
	
	private int pin;

	public int getPin() {
		
		if(pin==1001||pin==1234||pin==1212)
		{
			return pin;
		}
		else
		{
			return 0;
		}
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
}