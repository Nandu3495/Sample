package discountcalculation;

public class Offseason extends Discount {
	 Offseason(double amount) {
	        super(amount);
	    }

	    @Override
	    public void discount() {
	        double discountAmount = amount * 0.15;
	        System.out.println("Offseason discount :" + discountAmount);
	    }

	public static void main(String[] args) {
		 double purchaseAmount = 2000;  

	        Discount onseason = new Onseason(purchaseAmount);
	        Discount offseason = new Offseason(purchaseAmount);

	        System.out.println("Purchase Amount: " + purchaseAmount);

	        onseason.discount();
	        offseason.discount();
		// TODO Auto-generated method stub

	}

}
