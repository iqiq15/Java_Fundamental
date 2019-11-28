package java_20191128;

public class StringDemo {
	public static void main(String[] args) {
		String str = "111111-1111118";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		str = str.concat("abcd");// str + "abcd"
		System.out.println(str);

		String fileName = "abc.zip";
		if (fileName.endsWith("zip")) {
			System.out.println("zip 파일입니다");
		} else if (fileName.endsWith("ppt")) {
			System.out.println("PPT 파일 입니다.");
		}

		String uri = "artist/index.jsp";
		if (uri.startsWith("artist")) {
			System.out.println("작가 페이지 입니다.");
		} else if (uri.startsWith("exhibition")) {
			System.out.println("전시 페이지 입니다.");
		}

		System.out.println("abd".equalsIgnoreCase("aBC"));

		String s1 = "a";
		String s2 = "성";
		System.out.println(s1.getBytes().length);
		System.out.println(s2.getBytes().length);
		// str = "111111-1111118"
		System.out.println(str.indexOf("-"));
		fileName = "abc.bde.fafb.asdf.ppt";
		System.out.println(fileName.lastIndexOf("."));
		String first = str.substring(0, 6);
		String second = str.substring(7);
		System.out.println(first);
		System.out.println(second);

		String content = "abc\nabc\ncba\nabc";
		content = content.replaceAll("\n", "<br>");

		s1 = "abc";
		s2 = "abc ";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.trim().equals(s2.trim()));
		//String.valueOf() => pimitive data type => String
		s1 = String.valueOf(100);// 1+"";
		System.out.println(s1);
		
		String phone = "010-3024-1703";
		String[] temp = phone.split("-");
		for (String string : temp) {
			System.out.println(string);
		}
		
		str = String.format("%3$,10.2f %2$,10.2f %1$,10.2f", 10000.234,20000.123,30000.456);
		System.out.println(str);
		
		System.out.printf("%d%n",100);
		System.out.format("%d%n",100);
		
	}
}
