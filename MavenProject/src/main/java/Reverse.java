
public class Reverse {
	 int number;    
	    int reverse;  
	    Reverse(int number) {
	        this.number = number;  
	        int temp = number;
	        int reverse = 0;
	        while(temp!=0)
	        {
	        int digit = temp%10;
	        this.reverse=this.reverse*10+digit;
	        temp=temp/10;
	        }
	        new Reverse(this);
	    }
	    Reverse(Reverse obj) {
	        System.out.println("Finding Reverse...");
	        System.out.println("Original Number: " + obj.number);
	        System.out.println("Reversed Number: " + obj.reverse);
	    }


	public static void main(String[] args) {
		 new Reverse(56789);
    }
}
		// TODO Auto-generated method stub

