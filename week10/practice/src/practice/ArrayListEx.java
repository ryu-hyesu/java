package practice;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hello");
		a.add("Hi");
		a.add("Java");
		a.add("Java");
		System.out.println("Size: " + a.size());
		
		a.add(2, "Sahni"); // 2번 위치에 요소 삽입
		System.out.println(a); // a.toString() 자동호출
		
		a.set(2, "James"); // 2번 위치 요소 변경
		System.out.println(a);
		
		String str = a.get(1);
		System.out.println(str);
		
		a.remove(1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
	}	

}
