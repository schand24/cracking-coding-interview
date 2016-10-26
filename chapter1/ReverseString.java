//implement a function to reverse a string

class ReverseString{

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s){
		StringBuilder a = new StringBuilder(s);
		int l = 0, r = a.length()-1;
		while (l<r) {
			char temp = a.charAt(l);
			a.setCharAt(l,a.charAt(r));
			a.setCharAt(r,temp);
			l++;r--;
		}
		return a.toString();
	}
	
}