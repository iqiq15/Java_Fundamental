package java_20191122.aa;
//public 없으면 다른 패키지에서 import 불가
public class Notice {
	public int number;
	protected String title;
	int hit;
	private String regdate;
	
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 10;
		n.title = "title";
		n.hit = 100;
		n.regdate = "2019-11-22";

	}
}
