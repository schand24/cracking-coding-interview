//1.5 Implement a method to perform basic string compresssion using counts of repeated characters
//for example aabcccccaaa would become a2b1c5a3. 
//if compressed string would not become smaller than original string return the original string.


class CompressString{

	public static void main(String[] args) {
		String input = "aabcccccaaab";
		System.out.println(compress(input));
	}
	public static String compress(String a){
		int count = 1;
		StringBuffer output = new StringBuffer();

		for (int i = 0 ; i < a.length()-1; i++  ) {
			if (a.charAt(i) == a.charAt(i+1)) {
				count++;
			}
			else{
				output = output.append(a.charAt(i) + ""+count);
				count = 1;
			}
		}
		//if(count>1)
		output = output.append(a.charAt(a.length()-1) + ""+count);
		String temp = new String(output);
		if (temp.length() >= a.length())
			return a;
		else
			return temp;
	}
	
}