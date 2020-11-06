package mainpackage;

public class Generic {
	public  static void main(String[] args) {
		String[] a1= {"Ronald Kibet","Risper Jeptolo","Violah Jepkurgat","Maxmilah Jebungei","Leonard Kimutai"};
		Integer[] a2= {27,25,20,16,10};
		Double[] a3= {9.2,9.5,2.0,2.14,2.08};
		print(a1);
		print(a2);
		print(a3);
	}
	
	static<T>void print(T[] ar) {
	for(T s: ar) {
		System.out.println(s);
	}
}
	
	
//	static void print(String[] ar) {
//		for(String s: ar) {
//			System.out.println(s);
//		}
//	}
//	static void print(int[] ar) {
//		for(int s: ar) {
//			System.out.println(s);
//		}
//	}
//	static void print(double[] ar) {
//		for(double s: ar) {
//			System.out.println(s);
//		}
//	}

}
