package test0802;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String,Integer> scoreMap =new HashMap<String,Integer>();
		scoreMap.put("1",5);
		scoreMap.put("2",40);
		scoreMap.put("3",100);
		scoreMap.put("4",20);
		scoreMap.put("5",10);
		
		Set<String> keys= scoreMap.keySet();
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			
			String name= it.next();
			int score=scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
		
	}
}
