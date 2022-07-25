package com.jnit.training.arraysandstrings;

public class StringMethods {
   
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		System.out.println(a);
        int length = a.length();//Finds length of the string
        System.out.println(length);
        String c = a.concat(b);//combine 2 strings
        System.out.println(c);
        boolean result = a.equals(c);//compare 2 strings weather they are equal or not
        System.out.println("String a and c are equal="+result);
        System.out.println(a.toLowerCase());//change to uppercase
        System.out.println(b.toUpperCase());//change to lowercase
        System.out.println(b.trim());//Delete the front and back spaces in the string
        System.out.println(a.charAt(1));
        String d = "ava programming ava developer AWS ava developer";
        String s1 = d.replace("ava","java");//Replace the word with a given word
        System.out.println(s1);
        int e =10;
        String s2 = String.valueOf(e);//changes int,float,char,long,double,boolean,charAt into String
        System.out.println(s2+3);
        String str = String.join("*","you","are","beautiful");
        int s =str.indexOf(s1);
        System.out.println(s);
        System.out.println(str);
        StringBuilder sb = new StringBuilder("Java");
        sb.append(result);
        System.out.println(sb);
	}

}
