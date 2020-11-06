package mainpackage;

public class StringsInJava {
	
public static void main(String[] args) {
	String myName="Ronald Kibet";
	//length of text
	System.out.println("Lenth of Characters :"+myName.length());
	//first character
	 System.out.println("First Character :"+myName.charAt(0));
	 //last character
	 System.out.println("Last Character :"+myName.charAt(myName.length()-1));
	 //printing the characters
	 //for(int i=0;i<myName.length();i++)
		 //print downwards
		//System.out.println(myName.charAt(i));
		 //print accross
		//System.out.print(myName.charAt(i));
	 System.out.println("Print the Reverse");
	 for(int i=myName.length()-1;i>0;i--)
		 System.out.print(myName.charAt(i));
	 
	 //splitting the text
	 String text ="He is in Annex Eldoret";
	 String[] splitData =text.split(" ");
	 for(int j =0;j<splitData.length;j++)
		 System.out.println(splitData[j]);
	 
	 
}
}
