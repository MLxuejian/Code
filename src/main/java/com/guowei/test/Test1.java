package com.guowei.test;

public class Test1 {
	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 312;
		Integer f = 312;
		Long g = 3L;
		System.out.println(c==d);//true
		System.out.println(e==f);//false
		System.out.println(c==a+b);//true
		System.out.println(c.equals(a+b));//true
		System.out.println(g==a+b);//true
		System.out.println(g.equals(a+b));//false

	}
}
