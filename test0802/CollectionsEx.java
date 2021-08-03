package test0802;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEx {
	public static void main(String[] args) {
		LinkedList<String> myList =new LinkedList<String>();
		myList.add("다");
		myList.add("하");
		myList.add("마");
		myList.add("가");
		myList.add("다라");
		myList.add(0,"도레미");
		myList.add(3,"사");
		
		Collections.sort(myList);
		System.out.println(myList);
	}
}
