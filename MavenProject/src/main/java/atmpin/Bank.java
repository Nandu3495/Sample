package atmpin;

public class Bank {
private int pin;
public void setPin(int pin) {
	this.pin=pin;
}
public void validatepin() {
	if(pin==1001||pin==1234||pin==1212)
	{
		System.out.println("Valid pin, Amount withdrawn successfully");
	}
	else {
		System.out.println("Invalid pin Transaction denied");
	}
}
}