
public class PalindromeCheck {
	 public static boolean Palindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; // Not a palindrome
	            }
	            left++;
	            right--;
	        }
	        return true; // It is a palindrome
	 }

	public static void main(String[] args) {
		 String[] words = {"java", "malayalam"};

	        for (String word : words) {
	            if (Palindrome(word)) {
	                System.out.println(word + " is a palindrome.");
	            } else {
	                System.out.println(word + " is not a palindrome.");
		// TODO Auto-generated method stub

	}
}
	}
}
