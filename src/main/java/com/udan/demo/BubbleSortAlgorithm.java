package com.udan.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int sort(int[] number, int numberToSearchFor)  {
		//implement sorting algorithm
		//return the key
		return 3;
	}
	
}
