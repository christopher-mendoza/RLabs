package dev.mendoza.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Collections: a class filled with static methods used to manipulate collections
 * 
 * NOT to be confused with Collection
 * Collection: an interface that provides the standard functionality of a collection
 * 			   sometimes also referred to as the Collection API
 */
public class SortingPlayground {

	public static void main(String[] args) {
		// We also have an Arrays class
		int[] intArr = { 6, 3, 52, 44, 66, 8, 9, 2, 3333, 77, 0, 7};
		
		System.out.println("\nBefore sorting...");
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		
		Arrays.sort(intArr);
		System.out.println("\n\nAfter sorting...");
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(0);
		intList.add(2);
		intList.add(1);
		intList.add(7);
		intList.add(5);
		
		System.out.println("\n\nInteger List before sort...");
		for(int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
		
		Collections.sort(intList);
		System.out.println("\n\nInteger List after sort...");
		for(int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
		
		/*
		 * Both TreeSet an TreeMap order the insertion of objects into the collection
		 * based on a sorting method
		 * 		- Sorting can be implicit (Strings, primitives)
		 * 		- Sorting can also be explicit (implementing Comparable or passing an 
		 * 		  instance of a Comparator to the constructor)
		 * 
		 * TreeSet and TreeMap sort at the moment of insertion.
		 */
		Set<String> myExampleTreeSet = new TreeSet<>();
		myExampleTreeSet.add("Hello");
		myExampleTreeSet.add("!Hello");
		myExampleTreeSet.add("1Hello");
		myExampleTreeSet.add(" World");
		myExampleTreeSet.add("Gamer");
		
		System.out.println("\n\n TreeSet");
		for(String s : myExampleTreeSet) {
			System.out.print(s + " ");
		}
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1,  "One");
		treeMap.put(3,  "Three");
		treeMap.put(2,  "Two");
		
		
		System.out.println("\n\nTreeMaps");
		Iterator it = treeMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		// Collections col = new Collections(); Collections class' constructor is private
	}
}
