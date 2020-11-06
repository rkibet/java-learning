package mainpackage;

public class NestedForLoop {
public static void main(String[] args) {
	//to give a pattern
	for(int i=0;i<10;i++) {
		System.out.println("*");
		
		for(int y=i;y>=0;y--) 
			System.out.print("-");
		
	}
}
}
