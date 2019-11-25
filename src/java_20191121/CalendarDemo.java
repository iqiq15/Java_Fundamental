package java_20191121;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기 1. 1년 1월 1일은 월요일 2. 1년 365일, 윤년은 366일 - 2월 29일 3. 윤년은 4년마다
		 * 발생하고 그중에서 100배수는 제외하고 400의 배수는 제외하지 않는다. 4. 2019년 12월 25일 무슨 요일?
		 */

		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// coding
		int preyear = year - 1;
		int yearDay = preyear * 365 + preyear / 4 - preyear / 100 + preyear / 400;

		int monthDay = 0;
		for (int i = 0; i < month - 1; i++) {
			monthDay += monthArray[i];
		}

		int totalDay = yearDay + monthDay + day;
		totalDay = totalDay % 7;
		if (totalDay == 0) {
			message = "일요일";
		} else if (totalDay == 1) {
			message = "월요일";
		} else if (totalDay == 2) {
			message = "화요일";
		} else if (totalDay == 3) {
			message = "수요일";
		} else if (totalDay == 4) {
			message = "목요일";
		} else if (totalDay == 5) {
			message = "금요일";
		} else if (totalDay == 6) {
			message = "토요일";
		}

		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);
	}
}
