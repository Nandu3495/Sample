
public class Studentmarks {
	int mark1, mark2, mark3;
    Studentmarks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    int getTotal() {
        return mark1 + mark2 + mark3;
    }
    void printGrade(int total) {
        if (total < 150) {
            System.out.println("Grade: Fail");
        } else if (total <= 100) {
            System.out.println("Grade: D");
        } else if (total <= 120) {
            System.out.println("Grade: C");
        } else if (total <= 150) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: A");
        }
    }
	public static void main(String[] args) {
		 Studentmarks s1 = new Studentmarks(50, 60, 70);
	        Studentmarks s2 = new Studentmarks(55, 45, 65);

	        // Student 1
	        int total1 = s1.getTotal();
	        System.out.println("Student 1 Total Marks: " + total1);
	        s1.printGrade(total1);

	        // Student 2
	        int total2 = s2.getTotal();
	        System.out.println("Student 2 Total Marks: " + total2);
	        s2.printGrade(total2);
	    }
		// TODO Auto-generated method stub
}
