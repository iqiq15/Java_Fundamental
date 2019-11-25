package java_20191121;

public class LotteryDemo2 {
	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의의 double 값을 반환
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			double random = Math.random();
			int temp = (int) (random * 45) + 1;
			boolean isExisted = false;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == temp) {
					isExisted = true;
					break;
				}
			}
			if (isExisted) {
				i--;
			} else {
				lotto[i] = temp;
			}

		}

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i + 1); j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
		for (int i : lotto) {
			System.out.print(i + "\t");
		}
	}
}
