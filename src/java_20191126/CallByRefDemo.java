package java_20191126;

public class CallByRefDemo {
	public static void change(int i, int[] j, String str) {
		i = 20;
		j[3] = 400;
		str += "123";
	}

	public static void main(String[] args) {
		int a = 10;
		int b[] = { 1, 2, 3, 4 };
		String str = "abc";
		System.out.println(a);
		System.out.println(b[3]);

		// a => call by value, b => call by reference
		CallByRefDemo.change(a, b, str);

		System.out.println(a);// call by value 메서드 호출 후 변화 없음
		System.out.println(b[3]);// call by reference 메서드 호출 후 변화 있음
		System.out.println(str);
		int[] c;//메모리에 저장되지 않는다
		//System.out.println(c);
		c = new int[4];
		
		int[] d = null;
		System.out.println(d);
		d = new int[4];
		
	}
}
