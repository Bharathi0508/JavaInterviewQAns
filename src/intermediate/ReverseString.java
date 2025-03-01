package intermediate;

public class ReverseString {

	public static void main(String[] args) {
		
		String word = "Bharathi";
		
		System.out.println(word.length());
		
		String reversed = "";
		
		for(int i = word.length()-1; i>=0; i--) {
			
			reversed+= word.charAt(i);
		}
     System.out.println(reversed);
	}
}


/*
 * public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed); // Output: olleH
    }
}

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(charArray)); // Output: olleH
    }
}



 */






