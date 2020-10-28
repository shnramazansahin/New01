package project;

public class First {

	public static void main(String[] args) {
		String st= "aaaabbbccdda";
		String str= "";
		int count=1;
		for(int i=0;i<st.length()-1;i++) {
			if(st.charAt(i)==st.charAt(i+1)) {
				count++;
			}else {
				str= str+st.charAt(i)+ count;
				count=1;
				
			}
		}
		System.out.println(str+ (st.charAt(st.length()-1)));
	}

}
