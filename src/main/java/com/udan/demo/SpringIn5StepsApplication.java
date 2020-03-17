package com.udan.demo;

import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	//What are the beans
	//What are the dependencies of bean
	//Where to search for beans

	public static void main(String[] args) {
		
		
		BinarySearchIMpl binarySearchIMpl=new BinarySearchIMpl(new BubbleSortAlgorithm());
		BinarySearchIMpl quickSearchIMpl=new BinarySearchIMpl(new QuickSortAlgorithm());
				
		System.out.println(binarySearchIMpl.binarySearch(new int[] {1,2,3,4,5,6,6},1));
		
		System.out.println(quickSearchIMpl.binarySearch(new int[] {1,2,3,4,5,6,6},1));
		ApplicationContext applicationContext= SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchIMpl binarySearchIMpls=applicationContext.getBean(BinarySearchIMpl.class);
		System.err.println(binarySearchIMpl.binarySearch(new int[] {1,2,3,4,5,6,6},1));
		
		
		
	}

}
