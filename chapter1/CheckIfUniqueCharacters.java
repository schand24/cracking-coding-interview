//Implement an algorithm to determine if a string has all unique characters? 
//what if you cannot use additioanl datastructures?
class CheckIfUniqueCharacters{

	public static void main(String[] args) {
		String str = "abcde";
		String str2 = "abcdea";
		System.out.println(checkUnique1(str));
		System.out.println(checkUnique2(str2));
	}
	public static boolean checkUnique1(String a){
		for(int i = 0 ; i< a.length()-1; i++){
			for (int j=i+1;j<a.length() ;j++ ) {
				if(a.charAt(i) == a.charAt(j))
					return false;
			}
		}
		return true;
	}
	public static boolean checkUnique2(String a){
		int[] ch = new int[26];

		for (int i = 0; i< a.length() ;i++ ) {
			ch[a.charAt(i)-97]++;
		}
		for (int i = 0; i< ch.length ;i++ ) {
			if(ch[i]>1)
				return false;
		}
		return true;
	}
	
}

