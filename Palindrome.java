import java.util.Stack;
import java.util.Scanner;
class Palindrome
{
	public static void main(String args[]){
	System.out.print("Enter any string");
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	Stack st=new Stack();
	for(int i=0;i<str.length();i++)
	{
		st.push(str.charAt(i));
	}
		String reverseString ="";
	while(! st.isEmpty()){
		reverseString=reverseString+st.pop();
	}
	if(str.equals(reverseString))
		System.out.println("It is a Palindrome");
	else
		System.out.println("It is not a Palindrome");
}
}