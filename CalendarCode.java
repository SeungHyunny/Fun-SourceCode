package fun;

import java.util.Calendar;

public class CalendarCode {
// 달력만들기
// 달력생성의 원리 - 그달의 첫날짜의 요일과 마지막 일자를 알면된다.
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			CalendarCode.dispCalendar(2021, i);
		}
	}

	public static void dispCalendar(int year, int month) {
		Calendar startDay = Calendar.getInstance();
		startDay.set(year, month - 1, 1);
		System.out.println("\n              >>> " + year + "년 " + month + "월 달력 <<<");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("---------------------------------------------------");
		int blankNum = startDay.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDate = startDay.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i<=blankNum;i++){
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%02d\t",i);
			if (( i+ blankNum) % 7 == 0 ) System.out.println();
		} 
		System.out.println();
	}

}