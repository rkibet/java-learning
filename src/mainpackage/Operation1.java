 package mainpackage;

public class Operation1 implements MathsOperations {

	@Override
	public int sum(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public double div(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	@Override
	public int mult(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

}
