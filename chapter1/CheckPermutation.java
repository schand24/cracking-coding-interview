//1.3 given two strigs check if one string is permutation of other.


class CheckPermutation{
	
	public static void main(String[] args) {
		String a = "abcd", b = "bade";
		System.out.println(checkPermuation(a,b));
	}
	public static boolean checkPermuation(String a, String b){
		int[] ca = new int[26]; int[] cb = new int[26];
		for (int i = 0;i<a.length() ;i++ ) {
			ca[a.charAt(i)-97]++;
			cb[b.charAt(i)-97]++;
		}
		for (int i = 0;i<26 ;i++ ) {
			if(ca[i] != cb[i])
				return false;
		}
		return true;
	}
}