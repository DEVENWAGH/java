public class Area {
	public int area(int s) {
		return s * s;
	}

	public int area(int l, int b) {
		return l * b;
	}

	public static void main(String[] args) {
		Area aa = new Area();
		int x = aa.area(5);
		int y = aa.area(23, 45);
		System.out.println("Area of square is " + x);
		System.out.println("Area of rectangle is " + y);
	}
}