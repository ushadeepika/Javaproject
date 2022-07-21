package com.jnit.training.Constructor;

public final class KeywordFinal {
	 final int a = 10;
	 final int b = 20;
	 final void add() {
		System.out.println("add="+(a+b));
	}


	public static void main(String[] args) {
		KeywordFinal kf = new KeywordFinal();
        kf.add();
        
        
	}

}
