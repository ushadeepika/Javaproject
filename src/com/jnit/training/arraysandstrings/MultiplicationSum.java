package com.jnit.training.arraysandstrings;

public class MultiplicationSum {

	public static void main(String[] args) {
		int n =5,i, sum=0;
		for(i=1;i<=5;i++) {
		int	result = n*i;
		System.out.println("result="+result);
		   sum = result+sum;
		
    	
		}
		System.out.println("sum of results="+sum);
	}

}
