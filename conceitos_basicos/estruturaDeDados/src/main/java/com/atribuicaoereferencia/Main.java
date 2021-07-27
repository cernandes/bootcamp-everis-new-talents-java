package com.atribuicaoereferencia;

public class Main {

	public static void main(String[] args) {
		int intA = 1;
		int intB = intA;

		System.out.println("intA = " + intA + " intB = " + intB);
		intA = 2;
		System.out.println("intA = " + intA + " intB = " + intB);

		ReferenciaObj objA = new ReferenciaObj(1);
		ReferenciaObj objB = objA;

		System.out.println("-----------------");

		System.out.println("objA = " + objA + " objB = " + objB);
		objA.setNum(2);
		System.out.println("objA = " + objA + " objB = " + objB);

	}
}
