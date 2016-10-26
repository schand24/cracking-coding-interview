//1.8 Assume you have a method isSubString which checks if one word is a substring of other. 
//given two strings s1 and s2 write a code to check if s2 is a rotation of s1 using only one call to isSubString.
//Ex: waterbottle is a rotation of erbottlewat.


class CheckIsSubString{

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "rbottlewatx";
		System.out.println(checkIsSubstring(s1,s2));
	}
	public static boolean checkIsSubstring(String s1, String s2){
		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return s1s1.contains(s2);
		}
		return false;
	}
}