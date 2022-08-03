package com.jnit.training.exceptionHandling;

public class ArthimeticException {

	public static void main(String[] args) {
		
		try {
		int a =80;
		int b =0;
		int c = a/b;
		System.out.println("value of c="+c);
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		System.out.println("you cant divide a number by Zero");
		}
		finally {
			int e =10, f =20;
			System.out.println("multiply="+(e*f));
		}
		
		try {
			int d[]= {1,2,3,4};
		     d[5]=10;
			
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index out of bound");
		}
		
		try {
			String s = "hello";
		     System.out.println(s.charAt(5));
			
		}
		catch(StringIndexOutOfBoundsException si) {
			si.printStackTrace();
			System.out.println("String index out of bound");
			
		}
		try {
		String s1 ="usha";
		int i1 = Integer.parseInt(s1);
		System.out.println("integer="+i1);
		}
	
	catch(NumberFormatException nf) {
		nf.printStackTrace();
		System.out.println("number format exception");

}
		try {
			String s2 = null;
			System.out.println(s2.length());
		}
		catch(NullPointerException np) {
			np.printStackTrace();
			System.out.println("null pointer exception occured");
		}
		 try {
		        Object o = new String();
		        Integer i = (Integer) o;
		
		    }
		 catch(Exception e) {
			 e.printStackTrace();
			System.out.println("Class Cast exception occured"); 
		 }
	}
}
	
