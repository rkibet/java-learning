package mainpackage;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ls =new LinkedList<String> ();
		ls.add("The Late Dinah Jebichii");
		ls.add("Madam Grace Lagat");
		ls.add("Madam Rosbella Kirongo");
		ls.add("The Late Nelly Yego");
		ls.add("Mr Samwel Kiprotich Birech");
		ls.add("Madam Agness Birech");
		ls.add("Mr Alfayo Kipkorir Sorgor");
		ls.add("Mr Mike Kipkoech Tenai");
		ls.add("Madam Eunice Jepkogei Tembech");
		//ls.remove(7);
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
