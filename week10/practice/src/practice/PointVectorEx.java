package practice;

import java.util.Vector;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointVectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Point 객체를 요소로만 가지는 벡터 생성
		Vector<Point> v = new Vector <Point>();
		
		// 3개의 Point객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		System.out.println("contains (-5, 20 ? " + v.contains(new Point(-5, 20)));
	}

}
