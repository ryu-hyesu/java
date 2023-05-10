package practice;
import java.util.*;
public class IteratorVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); // 5삽입
		v.add(-1); // -1 삽입
		v.add(-2); // -2 삽입
		v.add(10); // 10 삽입
		System.out.println("before : " + v);
		
		Iterator<Integer> it = v.iterator();
		while( it.hasNext() )
			if( it.next() < 0 )
				it.remove();
		
		System.out.println("after : " + v);
	}

}
