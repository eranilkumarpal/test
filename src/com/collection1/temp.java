package com.collection1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class temp {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 4 };
		Map<Integer,Long> collect=Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((integer,aLong)
        ->System.out.println(integer+"->"+aLong));
	}
}
