package studentdetails;

public class Address {
	  String address;

	    void setAddress(String address) {
	        this.address = address;
	    }

	    void displayAddress() {
	        System.out.println("Address : " + address);
	    }

	public static void main(String[] args) {
		  Student student = new Student();
	        Address addr = new Address();

	        // Set values
	        student.setStudentDetails("Jithin", 101);
	        addr.setAddress("123, MG Road, Thrissur");

	        // Display values
	        student.displayStudent();
	        addr.displayAddress();
		
		// TODO Auto-generated method stub

	}

}
