package com.interview.questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumberPrint {

	public static void main(String[] args) {
		List list = new ArrayList();

		for (int i = 10; i <= 20; i++) {
			list.add(i);
		}
		System.out.println(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Integer I = (Integer) it.next();
			if (I % 2 == 0)
				System.out.print(I + " ");
		}

	}

}
