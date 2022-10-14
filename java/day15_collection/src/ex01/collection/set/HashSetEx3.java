package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override	//object로부터 오버라이드
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Person ) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age; 
		}
		
		return false;
	}
}  // Person end



public class HashSetEx3 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
//		Person ps = new Person("aaa", 55);
//		set.add(ps);
		set.add(new String("happy"));
		set.add(new String("happy"));
		set.add(new String("virus"));
		set.add(new Person("David", 10));
		set.add(new Person("David", 33));
		set.add(new Person("David", 10));
		set.add(new Person("doyeon", 10));
		
		System.out.println(set);
		
		
//		A a = new A();
//		B b = new B();
//		A bb = new B();
//		
//		System.out.println( b instanceof A);
//		System.out.println( b instanceof B);
//		System.out.println( a instanceof A);
//		System.out.println( a instanceof B);
		
	}
}

//class A {
//	String name;
//}
//class B extends A {
//	
//}









