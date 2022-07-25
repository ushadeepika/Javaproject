package com.jnit.training.arraysandstrings;

import java.util.Scanner;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0,odd =0;
		int a[][] = new int[2][2];
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				//a[i][j] = i + j;
				System.out.println("Enter values");
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
			if(a[i][j] % 2 ==0) {
			even ++;	
			}
			else {
				odd ++;
			}
			}
		}
		System.out.println("odd number="+odd);
		System.out.println("even number="+even);
        sc.close();
	}

}
