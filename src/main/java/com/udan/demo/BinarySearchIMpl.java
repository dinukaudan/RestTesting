package com.udan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchIMpl {
//Sorting an array
//Search an array
//Return the result
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	
	

	public BinarySearchIMpl(SortAlgorithm sortAlgorithm) {
	super();
	this.sortAlgorithm = sortAlgorithm;
}




	public int binarySearch(int[] number, int numberToSearchFor)  {
		
		int sortedNumber=sortAlgorithm.sort(number, numberToSearchFor);
		//implement sorting algorithm
		//return the key
		return sortedNumber;
	}


}

 
