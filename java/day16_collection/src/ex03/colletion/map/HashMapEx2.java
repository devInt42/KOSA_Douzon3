package ex03.colletion.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("호진", new Integer(90));
		map.put("민성", 100);
		map.put("보민", 50);
		map.put("지현", 80);
		map.put("서희", new Integer(75));
		
			Set set = map.entrySet();	//System.out.println(set);
			Iterator it = set.iterator();
		//		System.out.println(it.next());
		
		
		while(it.hasNext()) {
			Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey()+", 점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {//다음 요소가 있느냐?
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));

		
	}
}
