package ex02.collecion.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		list.addFirst("a");
		list.addLast("z");
		System.out.println(list);
		list.remove("k");	//k 제거
		System.out.println(list);
		list.remove(2);		//인덱스 번호로 제거
		System.out.println(list);
		list.removeFirst();	// 제일 첫번째 인덱스 삭제
		System.out.println(list);
		list.removeLast();	// 제일 마지막 인덱스 삭제
		System.out.println(list);
		list.set(2,"a");		//2번 인덱스를 a로 변경
		System.out.println(list);
		list.set(3,list.get(1)+"change");
		System.out.println(list);
		String str1 = (String)list.peek();
		System.out.println("=====================");
		System.out.println(str1);
		System.out.println(list);
		String str2 = (String)list.poll();
		System.out.println(str2);
		System.out.println(list);
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}