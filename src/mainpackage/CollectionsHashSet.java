package mainpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class CollectionsHashSet {
	public static void main(String[] args) {
		HashSet<String> hashSetDate = new HashSet<String>();
		hashSetDate.add("Ronald");
		hashSetDate.add("Jeptolo");
		hashSetDate.add("Jepkurgat");
		hashSetDate.add("Jebungei");
		hashSetDate.add("Kimutai");
		hashSetDate.add("Kimutai");
		System.out.println("........................HashSet Data........................");
		Iterator<String> itr=hashSetDate.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
		TreeSet<String> treeSetData = new TreeSet<String>();
		treeSetData.add("Ronald");
		treeSetData.add("Arnold");
		treeSetData.add("Jeptolo");
		treeSetData.add("Jepkurgat");
		treeSetData.add("Jebungei");
		treeSetData.add("Kimutai");
		treeSetData.add("Kimutai");
		System.out.println("........................TreeSet Data........................");
		Iterator<String> trset=treeSetData.iterator();
		while(trset.hasNext())
		System.out.println(trset.next());
	}

}
