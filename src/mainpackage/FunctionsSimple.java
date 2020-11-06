package mainpackage;

public class FunctionsSimple {
	//sum of two numbers
	float sum(float number1,float number2) {
		float sum=number1+number2;
		return sum;
	}
	//draw
void Draw() {
	for(int i=0;i<10;i++) {
		System.out.println("*");
		for(int j=i;j>=0;j--)
			System.out.print("-");
		}
}
		public static void main(String[] args) {

			//Sum of two numbers
			float results=new FunctionsSimple().sum(21, 6);
			System.out.println("Results :"+results);
			
			//Draw patterns
			new FunctionsSimple().Draw();
			
		}
	

}
