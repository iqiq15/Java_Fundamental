package java_20191126;
//i18n => Internationalization => 국제화
//l10l => Localization => 지역화
public class StaticInitializationDemo {
	int age;//instance variable
	static String title;//static variable
	static{
		System.out.println("static block");
		title = "모기지론";
	}
	//생성자의 접근 한정자는 객체 생성과 관련있다.
	public StaticInitializationDemo(int age){
		this.age = age;
		System.out.println("constructor");
	}
		
	
	public static void main(String[] args) {
		System.out.println("main");
		new StaticInitializationDemo(10);
		new StaticInitializationDemo(20);
		new StaticInitializationDemo(30);
	}
}
