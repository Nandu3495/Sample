
public class Calculator {
	public static void calculate(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("Average of integers: " + average);
    }
    public static void calculate(float a, float b, float c) {
        float average = (a + b + c) / 3;
        System.out.println("Average of floats: " + average);
    }
   public static void calculate(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    public static void calculate(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
    public static void calculate(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

	public static void main(String[] args) {
		 Calculator c = new Calculator();
	        c.calculate(10, 20, 30);               
	        c.calculate(10.5f, 20.5f, 30.5f);
	        c.calculate(7.0);               
	        c.calculate(5.0, 10.0);               
	        c.calculate(6);                    
	    }
}
		

		// TODO Auto-generated method stub
