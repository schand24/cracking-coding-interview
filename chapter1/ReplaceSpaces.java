//Replace all spaces in a string with %20

class ReplaceSpaces{

	public static void main(String[] args) {
		String input = "Mr John Smith";
		System.out.println(replaceSpaces(input));
	}
	public static String replaceSpaces(String a){
		char[] ch = new char[a.length()+6];
		for(int i = 0; i<a.length();i++)
			ch[i] = a.charAt(i);
		for (int i = 0 ; i< ch.length;i++ ) {
			if(ch[i] == ' '){
				for(int j = a.length()-1;j>i; j--){
					ch[j+3] = a.charAt(j);
				}
				ch[i] = '%';ch[i+1] = '2';ch[i+2]='0';
				a = new String(ch);
			}
		}

		return new String(ch);
	}
}