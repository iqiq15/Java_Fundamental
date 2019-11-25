package homework;

public class Homework2 {
	public static void main(String[] args) {
		// 문자 reverse 하기
		// 1.input "abcd" => "dcba"
		// 2.input "abcde" => "edcba"
		// length/2
		String input = "abcdefgh";
		char[] ch = input.toCharArray();

		for (int i = 0; i < ch.length / 2; i++) {
			int j = ch.length - i - 1;
			char a = ch[i];
			ch[i] = ch[j];
			ch[j] = a;
		}
		System.out.println(ch);

		// 1-100까지 소수를 구하시오
		// 나머지 구해서 걸리면 break
		// for if문

		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i != j) {
					break;
				} else if (i == j) {
					System.out.println(i);
				}

			}
		}
	}
}