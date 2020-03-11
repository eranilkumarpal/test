package com.dateprg.demo;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateExample2 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2020, 02, 24);
		System.out.println(date1.isLeapYear());
		LocalDate date = LocalDate.of(2019, 02, 24);
		System.out.println(date.isLeapYear());
		System.out.println(LocalTime.now());
	}

}
