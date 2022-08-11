package com.jnit.training.java8;

interface Stringreverse {

    
    String reverse(String n);
}

public class FunctionalInterface {
	    public static void main( String[] args ) {
	       Stringreverse ref = (str) -> {

	            String result = "";
	            for (int i = str.length()-1; i >= 0 ; i--)
	            result += str.charAt(i);
	            return result;
	        };

	      
	        System.out.println("reverse string = " + ref.reverse("ushadeepika"));
	    }

	
	}


