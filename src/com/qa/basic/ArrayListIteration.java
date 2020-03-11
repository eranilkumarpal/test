package com.qa.basic;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<>();
		tvSeries.add("Games of Throne");
		tvSeries.add("Breaking bad");
		tvSeries.add("The big Bang Theory");
		tvSeries.add("The walking dead");
		tvSeries.add("Prison Break");
		tvSeries.add("Secret Games");

		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});
		
		

	}

}
