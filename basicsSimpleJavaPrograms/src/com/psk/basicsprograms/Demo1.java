package com.psk.basicsprograms;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object result = LocalDate
				.of(2030, Month.SEPTEMBER,21)
				.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))
				.plusDays(7)
				.minusWeeks(4)
				.getDayOfWeek();
		System.out.println("result :"+ result);
	}

}
