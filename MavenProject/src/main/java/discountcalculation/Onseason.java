package discountcalculation;

public class Onseason extends Discount {
	 Onseason(double amount) {
	        super(amount);
	    }
	   public void discount() {
	        double discountAmount = amount * 0.40;
	        System.out.println("Onseason discount :" + discountAmount);
	    }
}
